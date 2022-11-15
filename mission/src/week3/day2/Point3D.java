package week3.day2;

public class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp(){
        z += 1;
    }

    public void moveDown(){
        z -= 1;
    }

    public void move(int x, int y, int z){
        super.move(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z +") 의 점";
    }
}
