package week1.day4.question3;


public class Person {

    private String name;
    private int money;
    private boolean isWayToWork;

    public Person(String name, int money, boolean isWayToWork) {
        this.name = name;
        this.money = money;
        this.isWayToWork = isWayToWork;
    }

    public String order(Cafe cafe, String drinkName){
        int drinkPrice = cafe.getDrinkPrice(drinkName);
        cafe.calculate(drinkName, drinkPrice);
        this.money -= drinkPrice;

        return name + "님의 남은 돈은 " + money +"원 입니다. " +
                cafe.getName() + "에서" + drinkName + "를 마셨습니다.";
    }

}
