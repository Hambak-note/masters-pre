package week2.day2.question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ReservationSystem {
    private Map<Integer, Seat[]> seatMap;
    private BufferedReader br;

    public ReservationSystem() {
        seatMap = new HashMap<>();
        seatMapInit();
        this.br = new BufferedReader(new InputStreamReader(System.in));

    }

    public void seatMapInit(){
        Seat[] sType = new Seat[10];
        Seat[] aType = new Seat[10];
        Seat[] bType = new Seat[10];

        for(int i = 0; i < 10; i++){
            sType[i] = new Seat(1, i+1);
            aType[i] = new Seat(2, i+1);
            bType[i] = new Seat(3, i+1);
        }

        seatMap.put(1, sType);
        seatMap.put(2, aType);
        seatMap.put(3, bType);

    }

    public void run() throws IOException {
        System.out.println("Shine 콘서트홀 예약 시스템입니다.");
        System.out.println();
        int inputMenu = 0;
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            inputMenu = Integer.parseInt(br.readLine());

            if (inputMenu == 1) {reservation(); continue;}
            if (inputMenu == 2) {lookup(); continue;}
            if (inputMenu == 3) {cancel();continue;}
            if (inputMenu == 4) {System.out.println("<<<<<시스템 종료>>>>>");return;}
            System.out.println("1~4번 항목을 입력해주세요.");
        }
    }

    private void reservation () throws IOException {
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
        int seatType = Integer.parseInt(br.readLine());
        if(seatDivision(seatType) == false){ return; }

        Seat[] seatStatus = seatMap.get(seatType);

        for (int i = 0; i < seatStatus.length; i++) {
            System.out.print(seatStatus[i].getBooker()+" ");
        }
        System.out.println();
        System.out.print("이름>> ");
        String inputName = br.readLine();

        System.out.print("번호>> ");
        int inputNumber = Integer.parseInt(br.readLine());
        if(inputNumber > 10 || inputNumber < 1) { System.out.println("정확한 좌석 번호 입력해주세요"); return;}
        if(seatStatus[inputNumber-1].getIsBooked()){
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요");
            return;
        }
        System.out.println();
        seatStatus[inputNumber-1].setIsBooked(true);
        seatStatus[inputNumber-1].setBookerName(inputName);
    }

    private void lookup(){
        for(int i = 1; i <= seatMap.size(); i++){
            Seat[] seatStatus = seatMap.get(i);
            seatDivision(i);
            for (int j = 0; j < seatStatus.length; j++) {
                System.out.print(seatStatus[j].getBooker() + " ");
            }
            System.out.println();
        }
        System.out.println("<<<<조회를 완료했습니다.>>>>");
        System.out.println();
    }

    private void cancel() throws IOException {
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
        int seatType = Integer.parseInt(br.readLine());
        if(seatDivision(seatType) == false){ return;}

        Seat[] seatStatus = seatMap.get(seatType);



        for (int i = 0; i < seatStatus.length; i++) {
            System.out.print(seatStatus[i].getBooker()+" ");
        }
        System.out.println();
        System.out.print("이름>> ");
        String inputName = br.readLine();

        for(int i = 0; i < seatStatus.length; i++){
            String getName = seatStatus[i].getBooker();
            if(inputName.equals(getName)){
                seatStatus[i].setBookerName("__");
                seatStatus[i].setIsBooked(false);
                System.out.println();
                return;
            }
        }
        System.out.println("입력하신 이름으로 예약한 내역이 없습니다.");
        System.out.println();
    }

    private boolean seatDivision(int seatType){
        if (seatType == 1) {
            System.out.print("S>>");
            return true;
        }
        if (seatType == 2) {
            System.out.print("A>>");
            return true;
        }
        if (seatType == 3) {
            System.out.print("B>>");
            return true;
        }
        System.out.println("좌석타입은 1, 2, 3 중에 하나를 골라 주세요");
        return false;
    }


}
