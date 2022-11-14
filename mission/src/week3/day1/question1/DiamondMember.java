package week3.day1.question1;

public class DiamondMember extends Member{

    public DiamondMember(String name, int shoppingAmount, int parkingTime) {
        super(name, shoppingAmount, parkingTime);
        this.pointRatio = 0.1;
        this.saleRatio = 0.1;
        this.hourlyParkingFee = 0;
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("전문 상담원이 배정되었습니다.");
    }
}
