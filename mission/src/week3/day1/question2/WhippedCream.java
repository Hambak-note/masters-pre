package week3.day1.question2;

public class WhippedCream extends CoffeeDecorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding WhippedCream");
    }
}
