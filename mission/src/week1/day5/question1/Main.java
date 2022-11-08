package week1.day5.question1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int mathScore = scanner.nextInt();
        int scienceScore = scanner.nextInt();
        int englishScore = scanner.nextInt();

        Grade me = new Grade(mathScore, scienceScore, englishScore);
        System.out.println("평균은 " + me.scoreAverage()); // 평균을 계산하여 리턴
        scanner.close();

    }
}
