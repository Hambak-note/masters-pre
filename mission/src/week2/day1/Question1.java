package week2.day1;

public class Question1 {

    public static void main(String[] args) {
        char[] charArr = new char[26];

        int arrIdx = 0;
        for(char ch = 'A'; ch <= 'Z'; ch++){
            charArr[arrIdx] = ch;
            arrIdx++;
        }

        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }

        System.out.println();
    }
}
