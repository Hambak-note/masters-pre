package week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeSixNine {

    public static void main(String[] args) throws IOException {

        String endStr = "Quit";

        String inputStr = "dummy";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("1~99 사이의 정수를 입력하시오>> ");
            inputStr = br.readLine();

            if(inputStr.equals(endStr)) {
                System.out.println("게임이 종료됩니다.");
                return;
            }

            if(rangeOverCheck(inputStr)){
                System.out.println("범위 내의 숫자를 입력해주세요");
                continue;
            }



            if(checkNumberCount(inputStr) == 0){
                System.out.println("박수X");
                continue;
            }

            if(checkNumberCount(inputStr) == 1){
                System.out.println("박수 짝");
                continue;
            }
            System.out.println("박수짝짝");
        }

    }

    static int checkNumberCount(String number) {
        int count = 0;

        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == '3' || number.charAt(i) == '6'
                    || number.charAt(i) == '9'){
                count++;
            }
        }

        return count;
    }

    static boolean rangeOverCheck(String number){
        int intNum = Integer.parseInt(number);

        if (intNum < 1 || intNum > 99) {
            return true;
        }
        return false;
    }
}
