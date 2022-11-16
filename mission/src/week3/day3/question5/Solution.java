package week3.day3.question5;

import java.io.*;


class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        char ampmSeparator = s.charAt(s.length()-2);
        Integer hour = Integer.parseInt(s.substring(0, 2));
        StringBuilder conversionString = new StringBuilder();
        if(ampmSeparator == 'P'){
            if(hour != 12){
                hour = hour + 12;
            }
        }else {
            if(hour == 12) hour = 0;
        }
        if(hour < 10){
            conversionString.append("0");
            conversionString.append(hour.toString());
        }else{
            conversionString.append(hour.toString());
        }
        conversionString.append(s.substring(2, s.length()-2));

        return conversionString.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

