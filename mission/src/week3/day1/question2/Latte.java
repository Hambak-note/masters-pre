package week3.day1.question2;

public class Latte extends CoffeeDecorator{

    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Milk");
    }
}
