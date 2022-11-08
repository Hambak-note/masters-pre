package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintStar19 {

    private static char[][] starArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN = Integer.parseInt(br.readLine());

        int starArrLen = inputN * 4 - 3;
        starArr = new char[starArrLen][starArrLen];

        for(int i = 0; i < starArrLen; i++){
            Arrays.fill(starArr[i], ' ');
        }

        makeStarArr(0, starArrLen);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < starArrLen; i++){
            for (int j = 0; j < starArrLen; j++) {
                sb.append(starArr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }

    public static void makeStarArr(int x, int y){
        if(y <= x) return;

        for(int i = x; i < y; i++){
            starArr[x][i] = '*';
            starArr[y - 1][i] = '*';
            starArr[i][x] = '*';
            starArr[i][y-1] = '*';
        }

        makeStarArr(x + 2, y -2);
    }
}
