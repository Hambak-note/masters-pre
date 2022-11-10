package week2.day4.question2;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ScoreProcessingApp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = fileRead("input.txt");
        String input = br.readLine();

        //Student 생성
        ArrayList<Student> students = new ArrayList<>();
        while((input = br.readLine()) != null){
                students.add(createStudent(input));
        }

        //출력
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            s.printStudentState();
        }

    }
    private static BufferedReader fileRead(String fileName) throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\week2\\day4\\question2\\";
        return new BufferedReader(new FileReader(path+fileName));
    }

    private static Student createStudent(String input){
        StringTokenizer st = new StringTokenizer(input);
        String name = st.nextToken();
        int id = Integer.parseInt(st.nextToken());
        String major = st.nextToken();
        ArrayList<Integer> grades = new ArrayList<>();
        while (st.hasMoreTokens()) {
            grades.add(Integer.valueOf(st.nextToken()));
        }

        return new Student(name, id, major, grades);
    }

}
