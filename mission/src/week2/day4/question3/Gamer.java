package week2.day4.question3;

import java.util.ArrayList;

public class Gamer {

    private int money;
    private ArrayList<String> fruits;

    public Gamer() {
        money = 1000;
        fruits = new ArrayList<>();
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }

    public ArrayList<String> getFruits() {
        return fruits;
    }

    public void addFruit(String fruit){
        fruits.add(fruit);
    }

    public Memento createMemento(){
        ArrayList<String> copyFruits = new ArrayList<>();
        for (String fruit : fruits) {
            copyFruits.add(fruit);
        }
        return new Memento(this.money, copyFruits);
    }

    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        fruits.clear();
        for (String fruit : memento.getFruits()) {
            fruits.add(fruit);
        }
    }

}
