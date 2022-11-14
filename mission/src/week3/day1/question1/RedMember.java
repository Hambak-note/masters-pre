package week3.day1.question1;

public class RedMember extends Member{

    public RedMember(String name, int shoppingAmount, int parkingTime) {
        super(name, shoppingAmount, parkingTime);
        this.pointRatio = 0.01;
        this.saleRatio = 0;
        this.hourlyParkingFee = 3000;
    }

}
