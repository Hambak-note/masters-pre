package week4.day2.question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {

    public static void main(String[] args) throws IOException {
        StudentInformationManagement management = new StudentInformationManagement();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String inputStr = br.readLine();
            String[] split = inputStr.split(", ");

            management.addStudent(split[0], split[1], split[2], split[3]);
        }

        management.printAllStudent();

        while(true){
            System.out.print("학생 이름 >> ");
            String inputStr = br.readLine();
            if (inputStr.equals("그만")) {
                break;
            }
            management.printOneStudent(inputStr);
        }

    }
}
