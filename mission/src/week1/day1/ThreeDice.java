package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeDice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstDice = Integer.parseInt(st.nextToken());
        int secondDice = Integer.parseInt(st.nextToken());
        int thirdDice = Integer.parseInt(st.nextToken());

        int reward = 0;
        if(firstDice == secondDice && secondDice == thirdDice){
            reward = 10000 + firstDice*1000;
            System.out.println(reward);
        }else if(firstDice != secondDice && secondDice != thirdDice && firstDice != thirdDice){
            int maxDice = firstDice;
            maxDice = Math.max(maxDice, secondDice);
            maxDice = Math.max(maxDice, thirdDice);
            reward = maxDice * 100;
            System.out.println(reward);
        }else{
            if(firstDice == secondDice){
                reward = 1000 + firstDice*100;
                System.out.println(reward);
            }else if(firstDice == thirdDice){
                reward = 1000 + firstDice*100;
                System.out.println(reward);
            }else{
                reward = 1000 + secondDice*100;
                System.out.println(reward);
            }
        }
    }
}
