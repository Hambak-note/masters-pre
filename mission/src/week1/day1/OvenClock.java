package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinute = Integer.parseInt(st.nextToken());

        int cookingTime = Integer.parseInt(br.readLine());

        int cookingHour = cookingTime / 60;
        int cookingMinute = cookingTime % 60;

        currentHour += cookingHour;
        currentMinute += cookingMinute;



        if (currentMinute >= 60) {
            currentMinute = currentMinute % 60;
            currentHour+=1;
        }

        if(currentHour >= 24){
            currentHour = currentHour % 24;
        }

        System.out.println(currentHour + " " + currentMinute);


    }
}
