package week3.day4.question2;

import week3.day4.question2.domain.*;

import java.util.HashMap;
import java.util.Map;


public class StudentGradesProgram {
    private static Report report = new Report();
    private static Map<String, Course> courses = new HashMap<>();
    private static Map<String, Major> majors = new HashMap<>();
    private static Map<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {
        init();
        
        //방송댄스 과목 개설
        courseCreate("방송댄스", true);
        
        //방송댄스 수강관련 정보 추가
        addSignUpInformation(211213, "방송댄스", 95);
        addSignUpInformation(212330, "방송댄스", 85);
        addSignUpInformation(201518, "방송댄스", 55);
        
        //출력
        for(Course course : courses.values()){
            System.out.println(report.printResult(course));
        }
    }

    private static void init(){

        courseCreate("국어", false);
        courseCreate("수학", false);

        majorCreate("국어국문학과", courses.get("국어"));
        majorCreate("컴퓨터공학과", courses.get("수학"));

        addStudent("강감찬", 211213, "국어국문학과");
        addStudent("김유신", 212330, "컴퓨터공학과");
        addStudent("신사임당", 201518, "국어국문학과");
        addStudent("이순신", 202360, "국어국문학과");
        addStudent("홍길동", 201290, "컴퓨터공학과");

        addSignUpInformation(211213, "국어", 95);
        addSignUpInformation(211213, "수학", 56);
        addSignUpInformation(212330, "국어", 95);
        addSignUpInformation(212330, "수학", 98);
        addSignUpInformation(201518, "국어", 100);
        addSignUpInformation(201518, "수학", 88);
        addSignUpInformation(202360, "국어", 89);
        addSignUpInformation(202360, "수학", 95);
        addSignUpInformation(201290, "국어", 83);
        addSignUpInformation(201290, "수학", 56);
    }

    private static void courseCreate(String courseName, Boolean isPassFail) {
        courses.put(courseName, new Course(courseName, isPassFail));
    }

    private static void majorCreate(String majorName, Course majorRequiredCourses) {
        majors.put(majorName, new Major(majorName, majorRequiredCourses));
    }

    private static void addStudent(String studentName, Integer studentId, String majorName){
        students.put(studentId, new Student(studentName, studentId, majors.get(majorName)));
    }

    private static void addSignUpInformation(Integer studentId, String courseName, Integer point){
        Student student = students.get(studentId);
        Course course = courses.get(courseName);

        student.addScore(course, new Score(point, report.calculateGrade(student, course, point)));
        course.addStudent(student);
    }

}
