package week3.day5.question3and4;

public class Oval implements Shape{

    private final Integer width;
    private final Integer height;

    public Oval(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + "X" + height + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return width*height*PI;
    }
}
