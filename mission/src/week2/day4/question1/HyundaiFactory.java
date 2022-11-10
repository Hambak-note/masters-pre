package week2.day4.question1;

public class HyundaiFactory {

    private static int carNumber = 999;

    //static inner 클래스를 사용한 싱글톤 패턴 구현
    private static class HyundaiFactoryHolder{
        private static final HyundaiFactory INSTANCE = new HyundaiFactory();
    }

    public static HyundaiFactory getFactory(){
        return HyundaiFactoryHolder.INSTANCE;
    }

    public Car createCar(){
        carNumber++;
        return new Car(carNumber);
    }

}
