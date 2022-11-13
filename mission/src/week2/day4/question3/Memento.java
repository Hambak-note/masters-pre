package week2.day4.question3;

import java.util.ArrayList;

public class Memento {

    private final int money;
    private final ArrayList<String> fruits;

    public Memento(int money, ArrayList<String> fruits) {
        this.money = money;
        this.fruits = fruits;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<String> getFruits() {
        return fruits;
    }
}
