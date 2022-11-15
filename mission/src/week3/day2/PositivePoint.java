package week3.day2;

public class PositivePoint extends Point{

    public PositivePoint() {
    }

    public PositivePoint(int x, int y){
        super();
        if(isPositivePoint(x, y)){
            super.move(x, y);
        }
    }

    @Override
    public void move(int x, int y) {
        if(isPositivePoint(x, y)) {
            super.move(x, y);
        }
    }

    private boolean isPositivePoint(int x, int y){
        if(x < 0 || y < 0) return false;
        return true;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY()  +") 의 점";
    }
}
