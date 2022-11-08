package week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String oxStr;

        while(testCase > 0){
            oxStr = br.readLine();

            int score = 0;
            int start = 0;
            for(int end = 0; end < oxStr.length(); end++){
                if(oxStr.charAt(end) == 'O'){
                    score += (end-start+1);
                    continue;
                }
                start = end+1;
            }

            System.out.println(score);
            testCase--;
        }

        br.close();
    }
}
