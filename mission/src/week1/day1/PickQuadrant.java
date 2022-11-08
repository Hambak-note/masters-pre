package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PickQuadrant {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int xPos = Integer.parseInt(br.readLine());
        int yPos = Integer.parseInt(br.readLine());

        if(xPos > 0 && yPos > 0){
            System.out.println(1);
        }else if(xPos < 0 && yPos > 0){
            System.out.println(2);
        }else if(xPos < 0 && yPos < 0){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
