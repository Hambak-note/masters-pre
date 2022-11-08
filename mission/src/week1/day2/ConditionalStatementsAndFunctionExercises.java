package week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConditionalStatementsAndFunctionExercises {

    public static void main(String[] args) throws IOException {
        System.out.print("점 (x1, y1) (x2, y2)의 좌표를 입력하시오>> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int inputrectx1 = Integer.parseInt(st.nextToken());
        int inputrecty1 = Integer.parseInt(st.nextToken());
        int inputrectx2 = Integer.parseInt(st.nextToken());
        int inputrecty2 = Integer.parseInt(st.nextToken());

        if(isInRect(inputrectx1, inputrecty1, 100, 100, 200, 200)
                || isInRect(inputrectx2, inputrecty2, 100, 100, 200, 200)){
            System.out.println("충돌");
            return;
        }

        System.out.println("충돌X");

    }


    public static boolean isInRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
            return true;
        } else {
            return false;
        }
    }

}
