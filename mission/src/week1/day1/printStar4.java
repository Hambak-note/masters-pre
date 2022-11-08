package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printStar4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        for(int i = 0; i < inputN; i++){

            int repeatStar = inputN - i;
            int repeatBlank = inputN - repeatStar;
            while(repeatBlank != 0){
                System.out.print(" ");
                repeatBlank--;
            }

            while(repeatStar != 0){
                System.out.print("*");
                repeatStar--;
            }
            System.out.println();
        }
    }
}
