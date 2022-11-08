package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        boolean isOddLine = true;
        for (int i = 0; i < inputN; i++) {

            if (isOddLine) {
                for (int j = 0; j < inputN; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < inputN; j++) {
                    System.out.print(" *");
                }
            }
            isOddLine = !isOddLine;

            System.out.println();
        }
    }
}
