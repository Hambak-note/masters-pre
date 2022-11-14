package week3.day1.question2;

public class Mocha extends CoffeeDecorator{
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Mocha");
    }
}
