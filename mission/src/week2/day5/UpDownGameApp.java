package week2.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class UpDownGame{

    private int cardNumber;
    private int lowNumber;
    private int highNumber;

    public void startGame(){
        Random random = new Random();
        this.cardNumber = random.nextInt(100);
        this.lowNumber = 0;
        this.highNumber = 99;
    }

    public int getLowNumber() {
        return lowNumber;
    }

    public int getHighNumber() {
        return highNumber;
    }

    public boolean checkInputNumber(int input){
        if(input == this.cardNumber){
            System.out.println("맞았습니다.");
            return true;
        }
        if(input > this.cardNumber){
            this.highNumber = input;
            System.out.println("더 낮게");
            return false;
        }
        this.lowNumber = input;
        System.out.println("더 높게");
        return false;
    }
}


public class UpDownGameApp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isEnd = "n";

        System.out.println("수를 결정하였습니다. 맞추어 보세요");

        int count = 1;
        UpDownGame game = new UpDownGame();
        game.startGame();
        while(true){
            System.out.println(game.getLowNumber() + "-" + game.getHighNumber());
            System.out.print(count+">> ");
            int input = Integer.parseInt(br.readLine());
            if(game.checkInputNumber(input)){
                System.out.print("다시 하겠습니까?(y/n)>> ");
                isEnd = br.readLine();
                if(isEnd.equals("n")){
                    return;
                }
                game.startGame();
                count = 1;
                continue;
            }
            count++;
        }
    }

}
