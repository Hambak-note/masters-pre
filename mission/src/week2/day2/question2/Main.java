package week2.day2.question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        MonthSchedule monthSchedule = new MonthSchedule();
        while(!run(monthSchedule)){

        }
    }

    static boolean run(MonthSchedule monthSchedule) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputMenu;
        System.out.println("이번 달 스케줄 관리 프로그램");
        System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
        inputMenu = Integer.parseInt(br.readLine());

        boolean isNormalEnd = false;

        int day;
        String work;
        switch (inputMenu){
            case 1 :
                System.out.print("날짜(1~30)?");
                day = Integer.parseInt(br.readLine());
                System.out.print("할일(빈칸없이입력)?");
                work = br.readLine();
                System.out.println();
                monthSchedule.input(day, work);
                break;
            case 2:
                System.out.print("날짜(1~30)?");
                day = Integer.parseInt(br.readLine());
                System.out.println(day + "일의 할일은 " + monthSchedule.hasWork(day));
                System.out.println();
                break;
            case 3:
                System.out.println("프로그램을 종료 합니다.");
                isNormalEnd = true;
                break;
            default:
                System.out.println("제대로 된 입력을 입력해주세요");
                isNormalEnd = false;
                break;
        }

        return isNormalEnd;
    }
}
