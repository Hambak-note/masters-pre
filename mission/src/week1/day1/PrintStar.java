package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        for(int i = 1; i <= inputN; i++){

            for(int j = 0; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
