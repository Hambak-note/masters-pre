package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//System.out.println()으로 출력했을 때 시간 초과
//StringBuilder 사용 문자를 붙여 출력하니 시간 초과 해결
public class PrintStar11 {

    private static char[][] starArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //높이는 N, 가로의 길이는 2*N-1
        starArr = new char[N][2*N-1];

        for(int i = 0; i < N; i++){
            Arrays.fill(starArr[i], ' ');
        }

        makeStarArr(0, N-1, N);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2*N-1; j++){
                sb.append(starArr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());

    }

    private static void makeStarArr(int x, int y, int n){
        if(n == 3){
            starArr[x][y] = '*';
            starArr[x + 1][y - 1] = starArr[x + 1][y + 1] = '*';
            starArr[x + 2][y - 2] = starArr[x + 2][y - 1]
                    = starArr[x + 2][y] = starArr[x + 2][y + 1] = starArr[x + 2][y + 2] = '*';
            return;
        }

        int nextN = n/2;
        makeStarArr(x, y, nextN);
        makeStarArr(x+nextN, y-nextN, nextN);
        makeStarArr(x+nextN, y+nextN, nextN);
    }
}
