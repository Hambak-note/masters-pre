package week2.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndTalk {

    public static void main(String[] args) throws IOException {
        run("기러기");
    }

    public static void run(String start) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("끝말잇기 게임을 시작합니다");
        System.out.print("게임에 참여하는 인원은 몇명입니까>> ");
        int numberOfPerson = Integer.parseInt(br.readLine());
        Participant[] participants = new Participant[numberOfPerson];

        for (int i = 0; i < numberOfPerson; i++) {
            System.out.print("참가자 이름을 입력해주세요 >> ");
            participants[i] = new Participant(br.readLine());
        }

        System.out.println("시작 단어는 " + start + "입니다.");

        String preStr = start;
        String curStr;
        Referee referee = new Referee();
        while(true){

            for(int i = 0; i < numberOfPerson; i++){
                System.out.print(participants[i].getName() + ">> ");
                curStr = br.readLine();
                if(!referee.isValid(preStr, curStr)){
                    System.out.println(participants[i].getName() + "이 졌습니다.");
                    return;
                }
                preStr = curStr;
            }
        }
    }
}

