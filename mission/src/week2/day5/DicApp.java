package week2.day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;

class Dictionary{
    private static String[] kor = {"사랑","아기","돈","미래","희망"};
    private static String[] eng = {"love","baby","money","future","hope"};

    public static String kor2Eng(String word) {
        for(int i = 0; i < kor.length; i++){
            if(kor[i].equals(word)){
                return kor[i] + "은 " + eng[i];
            }
        }

        return word+"는 저의 사전에 없습니다.";
    }
}

public class DicApp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어? ");
            String word = br.readLine();
            if(word.equals("그만")){
                return;
            }
            String print = Dictionary.kor2Eng(word);
            System.out.println(print);
        }
    }
}


