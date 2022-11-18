package week3.day5.question3and4;

public class Rect implements Shape{

    private final Integer width;
    private final Integer height;

    public Rect(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + "X" + height + "크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
