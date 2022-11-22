package week4.day2.question1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
        String inputStr = sc.nextLine();

        String[] splitInput = inputStr.split(" ");

        double sum = 0;
        for (String s : splitInput) {
            sum += gradeConverter(s);
        }

        System.out.println(calculateAvg(sum, splitInput.length));
    }

    private static double gradeConverter(String grade){
        double score;

        if(grade.equals("A")){
            score = 4.0;
        } else if (grade.equals("B")) {
            score = 3.0;
        } else if (grade.equals("C")) {
            score = 2.0;
        } else if (grade.equals("D")) {
            score = 1.0;
        }else{
            score = 0;
        }

        return score;
    }

    private static double calculateAvg(double sum, double count){
        return sum / count;
    }

}
