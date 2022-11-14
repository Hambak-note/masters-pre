package week3.day1.question1;

public class PlatinumMember extends Member{


    public PlatinumMember(String name, int shoppingAmount, int parkingTime) {
        super(name, shoppingAmount, parkingTime);
        this.pointRatio = 0.05;
        this.saleRatio = 0.05;
        this.hourlyParkingFee = 1000;
    }
}
