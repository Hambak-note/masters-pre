package week1.day5.question4;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circles[] = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            System.out.print("x, y, radius >> ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            circles[i] = new Circle(x, y, radius);
        }


        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < circles.length; i++) {
            int currentR = circles[i].getRadius();
            if(max < currentR){
                max = currentR;
                maxIdx = i;
                continue;
            }
        }
        System.out.print("가장 면적이 큰 원은? ");
        circles[maxIdx].show();

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

    public int getRadius() {
        return radius;
    }
}
