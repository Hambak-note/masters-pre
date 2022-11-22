package week4.day2.question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PrintPopulation {

    static Map<String, Integer> inputMap;

    public static void main(String[] args) throws IOException {

        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        inputMap = new HashMap<>();

        StringTokenizer st;
        while(true) {
            System.out.print("나라 이름, 인구 >> ");
            st = new StringTokenizer(br.readLine());

            String key = st.nextToken();
            if (key.equals("그만")) {
                break;
            }
            Integer value = Integer.valueOf(st.nextToken());
            inputMap.put(key, value);
        }

        while(true){
            System.out.print("인구 검색 >> ");
            st = new StringTokenizer(br.readLine());
            String inputStr = st.nextToken();

            if (inputStr.equals("그만")) {
                break;
            }

            Integer value = inputMap.get(inputStr);
            if (value == null) {
                System.out.println(inputStr + " 나라는 없습니다.");
                continue;
            }
            System.out.println(inputStr + "의 인구는 " + value);
        }
    }



}
