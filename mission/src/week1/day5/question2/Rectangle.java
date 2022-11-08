package week1.day5.question2;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square(){
        return width * height;
    }

    public void show(){
        System.out.println("("+x+", "+y+") 에서" + "크기가 "+width+"x"+height+"인 사각형");
    }

//    public boolean contains(Rectangle r){
//          사각형을 포함하는지 확인하는 함수 구현 필요
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
