package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareTwoNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberA = Integer.parseInt(st.nextToken());
        int numberB = Integer.parseInt(st.nextToken());

        if(numberA > numberB){
            System.out.println('>');
        } else if (numberA < numberB) {
            System.out.println('<');
        }else{
            System.out.println("==");
        }

    }
}
