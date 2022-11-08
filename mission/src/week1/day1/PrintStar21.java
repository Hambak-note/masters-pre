package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar21 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        boolean isOddLine = true;
        boolean isOddPosition = true;
        for (int i = 0; i < inputN*2; i++) {

            if (isOddLine) {
                for (int j = 0; j < inputN; j++) {
                    if(isOddPosition){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    isOddPosition = !isOddPosition;
                }
            } else {
                for (int j = 0; j < inputN; j++) {
                    if(isOddPosition){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                    isOddPosition = !isOddPosition;
                }
            }
            isOddPosition = true;
            isOddLine = !isOddLine;

            System.out.println();
        }

        }
}
