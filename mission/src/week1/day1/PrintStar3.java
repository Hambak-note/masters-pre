package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        for(int i = 0; i < inputN; i++){

            int repeat = inputN - i;
            while(repeat != 0){
                System.out.print("*");
                repeat--;
            }
            System.out.println();
        }
    }
}
