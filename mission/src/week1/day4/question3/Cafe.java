package week1.day4.question3;

import java.util.HashMap;
import java.util.Map;

public class Cafe {
    private String name;
    private int money;

    private Map<String, Integer> menu;

    public Cafe(String name, int money) {
        this.name = name;
        this.money = money;
        menu = new HashMap<>();

    }

    public String getName() {
        return name;
    }

    public void addMenu(String name, int price){
        menu.put(name, price);
    }
    public int getDrinkPrice(String drinkName){
        return menu.get(drinkName);
    }

    public int calculate(String drinkName, int payment){
        this.money += payment;
        int drinkPrice = menu.get(drinkName);

        if(drinkPrice == payment){ return 0;}

        //거스름돈 있는 경우
        int change = payment - drinkPrice;
        this.money -= change;
        return change;
    }

}
