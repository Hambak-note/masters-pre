package week3.day2;

import week3.day1.question2.CoffeeDecorator;

public class ColorPoint extends Point{

    private String color;

    public ColorPoint(){
        super();
        this.color = "BLACK";
    }

    public ColorPoint(int x, int y){
        super(x, y);
        this.color = "BLACK";
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setXY(int x, int y){
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "색의 " + "("
                + super.getX() + ","+super.getY()+")의 점";
    }
}
