package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        for(int i = 1; i <= inputN; i++){

            for(int j = i; j < inputN; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = inputN-1; i >0; i--){
            for(int j = i; j < inputN; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
