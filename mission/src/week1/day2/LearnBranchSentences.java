package week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LearnBranchSentences {

    public static void main(String[] args) throws IOException {

        System.out.print("연산>> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstOperand = Integer.parseInt(st.nextToken());
        String Operator = st.nextToken();
        int secondOperand = Integer.parseInt(st.nextToken());

        double result;

        switch (Operator) {
            case "+" :
                result = firstOperand + secondOperand;
                System.out.println("계산 결과는 " + result);
                break;
            case "-" :
                result = firstOperand - secondOperand;
                System.out.println("계산 결과는 " + result);
                break;
            case "*" :
                result = firstOperand * secondOperand;
                System.out.println("계산 결과는 " + result);
                break;
            case "/" :
                if(secondOperand == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                result = firstOperand / secondOperand;
                System.out.println("계산 결과는 " + result);
                break;
        }

    }
}
