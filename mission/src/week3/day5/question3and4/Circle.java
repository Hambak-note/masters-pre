package week3.day5.question3and4;

public class Circle implements Shape{

    private final Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
}
