package week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scale {

    private static final int NUMBER_OF_NOTES = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] notes = new int[NUMBER_OF_NOTES];

        for (int i = 0; i < NUMBER_OF_NOTES; i++) {
            notes[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        String result = "";
        for(int i = 0; i < NUMBER_OF_NOTES-1; i++){
            if (notes[i] == notes[i+1] - 1) {
                result = "ascending";
                continue;
            }

            if (notes[i] == notes[i+1] + 1) {
                result = "descending";
                continue;
            }
            result = "mixed";
            break;
        }

        System.out.println(result);

    }
}
