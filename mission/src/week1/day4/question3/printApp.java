package week1.day4.question3;

public class printApp {
    public static void main(String[] args) {

        Person james = new Person("James", 5000, true);
        Person tomas = new Person("Tomas", 10000, true);
        Cafe star = new Cafe("별 다방", 10000);
        Cafe bean = new Cafe("콩 다방", 10000);

        star.addMenu("아메리카노", 4000);
        bean.addMenu("라떼", 5000);

        System.out.println(james.order(star, "아메리카노"));
        System.out.println(tomas.order(bean, "라떼"));
    }
}
