package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintStar10 {

    public static char[][] starArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        starArr = new char[N][N];

        for(int i = 0; i < N; i++){
            Arrays.fill(starArr[i], ' ');
        }

        makeStarArr(N, 0, 0);
        for (int i = 0; i < N; i++) {
            System.out.println(starArr[i]);
        }


    }

    public static void makeStarArr(int n, int x, int y){
        if(n == 1){
            starArr[x][y] = '*';
            return;
        }

        int nextN = n/3;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                //공백칸
                if(i == 1 && j == 1){
                    continue;
                }else{
                    makeStarArr(nextN, x + (nextN*i), y+(nextN*j));
                }
            }
        }
    }
}
