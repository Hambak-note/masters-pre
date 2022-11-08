package week1.day4.question1;

public class ArithmeticOperation {

    private TwoNumber twoNumber = new TwoNumber();

    public int plus(){
        return twoNumber.getFirst() + twoNumber.getSecond();
    }

    public int minus(){
        return twoNumber.getFirst() - twoNumber.getSecond();
    }

    public int multiplication(){
        return twoNumber.getFirst() * twoNumber.getSecond();
    }

    public int divide(){
        return twoNumber.getFirst() / twoNumber.getSecond();
    }

    public void printOperationResult(){
        System.out.println("덧셈 : " + plus());
        System.out.println("뺄셈 : " + minus());
        System.out.println("곱셈 : " + multiplication());
        System.out.println("나눗셈: " + divide());
    }
}
