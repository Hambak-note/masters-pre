package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfDigit = Integer.parseInt(br.readLine());

        String digit = br.readLine();

        int sum = 0;
        for (int i = 0; i < numberOfDigit; i++) {
            sum += digit.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
