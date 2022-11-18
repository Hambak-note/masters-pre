package week3.day5.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StackApp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringStack stringStack;

        System.out.print("총 스택 저장 공간의 크기 입력>> ");
        Integer capacity = Integer.valueOf(br.readLine());
        //스택 생성
        stringStack = new StringStack(capacity);

        while(true){
            System.out.print("문자열 입력 >> ");
            String inputStr = br.readLine();
            //"그만"이 입력되면 입력 종료
            if (inputStr.equals("그만")) break;
            //스택이 꽉찼는지 확인
            if(stringStack.push(inputStr)){
                continue;
            }
            System.out.println("스택이 꽉 차서 push 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");

        StringBuffer sb = new StringBuffer();
        int currentLen = stringStack.length();
        for(int i = 0; i < currentLen; i++){
            sb.append(stringStack.pop());
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
