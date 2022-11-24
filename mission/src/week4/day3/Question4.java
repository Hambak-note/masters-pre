package week4.day3;

public class Question4 {

    public static void main(String[] args) {
        for(int i = 0; i <20; i++){
            System.out.println(i);
            i+=2;


        }
    }

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     */
    static class Solution {

        public int romanToInt(String s) {
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int num = getNumber(c);

                if (i + 1 == s.length()) {
                    sum += num;
                    continue;
                }

                char next = s.charAt(i + 1);

                if (num < getNumber(next)) {
                    sum -= num;
                } else {
                    sum += num;
                }
            }

            return sum;
        }

        public int getNumber(char character) {
            switch (character) {
                case 'V': {
                    return 5;
                }
                case 'X': {
                    return 10;
                }
                case 'L': {
                    return 50;
                }
                case 'C': {
                    return 100;
                }
                case 'D': {
                    return 500;
                }
                case 'M': {
                    return 1000;
                }
                default: {
                    return 1;
                }
            }
        }
    }
}
