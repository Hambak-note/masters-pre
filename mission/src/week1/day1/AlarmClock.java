package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        minute -= 45;
        if(minute < 0){
            minute+= 60;
            hour-=1;
        }

        if(hour == -1){
            hour = 23;
        }

        System.out.println(hour + " " + minute);
    }
}
