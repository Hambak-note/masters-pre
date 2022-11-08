package week1.day5.question3;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circles[] = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            System.out.println("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            circles[i] = new Circle(x, y, radius);
        }

        for (int i = 0; i < circles.length; i++) circles[i].show();
        scanner.close();
    }

}

class Circle{
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show(){
        System.out.println("("+x+", "+y+")"+radius);
    }
}
