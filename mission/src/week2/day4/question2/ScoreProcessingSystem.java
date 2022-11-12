package week2.day4.question2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreProcessingSystem {

    private static int subjectId=1;
    private static int studentId;
    private static Map<Integer, Student> students;
    private static Map<Integer, Subject> subjects;
    private static ReadAndWrite rw;

    public static void main(String[] args) throws IOException {

        init();
        readFileProcessing();
        
        while(true){
            printMenu();
            int inputMenu = Integer.parseInt(rw.consoleRead());
            
            if(inputMenu == 1) { printStudentState((Student) findStudent()); continue;}
            if(inputMenu == 2) {addStudent(); continue;}
            if(inputMenu == 3) {
                System.out.print("학생 ID 입력 >> ");
                int id = Integer.parseInt(rw.consoleRead());
                if(isExistStudentId(id)){
                    inputScore(id);
                }
                rw.modifyFile("input.txt", students);
                continue;}
            if(inputMenu == 4) { ; continue;}
            if(inputMenu == 5) { System.out.println("시스템을 종료합니다."); return; }

            System.out.println("메뉴는 1~4번 중에 골라주세요");
        }

    }
    private static void init(){
        rw = new ReadAndWrite();
        subjects = new HashMap<>();
        students = new HashMap<>();
        subjects.put(subjectId, new Subject(subjectId++, "국어"));
        subjects.put(subjectId, new Subject(subjectId++, "수학"));
        subjects.put(subjectId, new Subject(subjectId++, "영어"));
    }

    private static void readFileProcessing() throws IOException {
        ArrayList<String> inputList = rw.fileRead("input.txt");

        for (int i = 0; i < inputList.size(); i++) {
            String[] splitInput = (inputList.get(i)).split(":");
            String name = splitInput[0];
            int id = Integer.parseInt(splitInput[1]);
            String major = splitInput[2];

            Student student = new Student(id, name, major, subjects.size());
            student.addScore(1, Integer.parseInt(splitInput[3]));
            student.addScore(2, Integer.parseInt(splitInput[4]));
            student.addScore(3, Integer.parseInt(splitInput[5]));

            students.put(id, student);
            studentId = ++id;
        }

    }

    private static void printStudentState(Student student){
        System.out.println(student.getName() + " 햑생은 " + student.getSubjectCount() + "과목을 수강했습니다");
        System.out.println("총점은 " + student.getTotal() + "점 평균은 " + student.getAverage()+ "점 입니다.");
        System.out.println();
    }

    private static void printMenu(){
        System.out.println("================== 성적 처리 시스템 ==================");
        System.out.println("1. 학생 조회 2. 학생 추가 3. 성적 입력 4. 파일 확인 5. 종료");
        System.out.print("메뉴를 입력해 주세요 >> ");
    }

    private static Student findStudent() throws IOException {
        System.out.print("학생 ID 입력 >> ");
        int id = Integer.parseInt(rw.consoleRead());
        return students.get(id);
    }

    private static void addStudent() throws IOException {
        System.out.print("학생 이름 입력 >> ");
        String name = rw.consoleRead();
        System.out.print("전공 과목 입력 >> ");
        String major = rw.consoleRead();
        Student student =  new Student(studentId, name, major, subjects.size());
        students.put(studentId,student);
        inputScore(studentId);
        System.out.println(name + " 학생의 ID는 " + studentId + "입니다.");

        //파일 쓰기
        String output = name + ":" + studentId + ":" + major + ":";
        for (int i = 1; i <= subjects.size(); i++) {
            output += (student.getScores(i) + ":");
        }
        System.out.println(output);
        rw.writeFile("input.txt", output);
        studentId++;
    }
    
    private static void inputScore(int id) throws IOException {
        while(true){
            System.out.print("과목 입력(1.국어 2.수학 3.영어 4.완료)  >> ");
            int subjectId = Integer.parseInt(rw.consoleRead());
            if(subjectId == 4) {
                System.out.println("점수 입력 완료");
                return;
            }
            if(subjectId != 1 && subjectId != 2 && subjectId != 3){
                System.out.println("과목은 1, 2, 3 중 하나를 골라주세요");
                return;
            }
            System.out.print("점수를 입력해 주세요 >> ");
            String score = rw.consoleRead();
            students.get(id).addScore(subjectId, Integer.parseInt(score));
        }
    }

    private static boolean isExistStudentId(int studentId){
        if(!students.containsKey(studentId)) {
            System.out.println("존재하지 않는 ID입니다.");
            return false;
        }
        return true;
    }

}
