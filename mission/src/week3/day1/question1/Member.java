package week3.day1.question1;

public class Member {

    private String name;
    private int shoppingAmount;
    private int parkingTime;
    protected double pointRatio;
    protected double saleRatio;
    protected int hourlyParkingFee;

    public Member(String name, int shoppingAmount, int parkingTime) {
        this.name = name;
        this.shoppingAmount = shoppingAmount;
        this.parkingTime = parkingTime;
    }

    public int calculatePrice(){
        int price = shoppingAmount - (int)(shoppingAmount * saleRatio);
        return price;
    }
    public int calculatePoint(){
        return (int) (shoppingAmount * pointRatio);
    }

   public int calculateParkingFee(){
       return parkingTime * hourlyParkingFee;
   }

   public void printStatus(){
       int price = calculatePrice();
       int point = calculatePoint();
       int parkingFee = calculateParkingFee();
       System.out.println(name + "님의 지불 금액은 " + price + "원이고, 적립 포인트는 " + point + "점 입니다");
       System.out.println("주차 요금은 " + parkingFee + "입니다.");
   }
}
