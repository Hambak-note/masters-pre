package week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PracticeIfLogic {

    private final int leftUpperX = 100;
    private final int leftUpperY = 100;
    private final int rightLowerX = 200;
    private final int rightLowerY = 200;


    public static void main(String[] args) throws IOException {

        String endStr = "Quit";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String inputStr1;
        String inputStr2;
        int positionX;
        int positionY;

        while (true) {
            System.out.print("점 (x, y)의 좌표를 입력하시오>> ");
            st = new StringTokenizer(br.readLine());
            inputStr1 = st.nextToken();

            if (inputStr1.equals(endStr)) {
                System.out.println("게임이 종료됩니다.");
                return;
            }

            inputStr2 = st.nextToken();

            positionX = Integer.parseInt(inputStr1);
            positionY = Integer.parseInt(inputStr2);

            if (positionX >= 100 && positionX <= 200
                    && positionY >= 100 && positionY <= 200) {
                System.out.println("(" + positionX + ", " + positionY + ") 는 안에 있습니다.");
                continue;
            }

            System.out.println("(" + positionX + ", " + positionY + ") 는 밖에 있습니다.");

        }
    }
}