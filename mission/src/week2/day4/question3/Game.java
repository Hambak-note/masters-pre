package week2.day4.question3;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Gamer gamer = new Gamer();
        Memento memento = gamer.createMemento();
        int fruitNumber = 1;


        int numberOfGames = 1;
        while(gamer.getMoney() > 0 && numberOfGames <= 100){
            int dice = rollTheDice();

            if (dice == 5) { continue; }

            if (dice == 1 || dice == 3) {
                gamer.setMoney(gamer.getMoney()+100);
            } else if(dice == 2 || dice == 4){
                gamer.setMoney(gamer.getMoney()/2);
            } else{
                fruitNumber = addFruit(fruitNumber, gamer);
            }

            memento = mementoCheck(gamer, memento);
            printState(gamer, numberOfGames);
            numberOfGames++;
        }
    }

    static public int rollTheDice(){
        Random random = new Random();
        int dice = random.nextInt(6);
        dice += 1;
        return dice;
    }

    static public int addFruit(int fruitNumber, Gamer gamer){
        if(fruitNumber == 1){
            gamer.addFruit("사과");
            return 2;
        }else if(fruitNumber == 2){
            gamer.addFruit("샤인머스킷");
            return 3;
        }else if(fruitNumber == 3){
            gamer.addFruit("귤");
            return 1;
        }
        System.out.println("과일 번호는 1,2,3 중에 골라주세요");
        return -1;
    }

    static public Memento mementoCheck(Gamer gamer, Memento memento){
        if(gamer.getMoney() > memento.getMoney()){
            return gamer.createMemento();
        }
        if(gamer.getMoney() < memento.getMoney()/2){
            gamer.restoreMemento(memento);
            return memento;
        }
        return memento;
    }

    static public void printState(Gamer gamer, int numberOfGames){
        System.out.println(numberOfGames + "회차 ================");
        System.out.println("돈 : " + gamer.getMoney());
        System.out.println("가지고 있는 과일 목록");
        for (String fruit : gamer.getFruits()) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

}
