package week4.day3;

public class Question2 {

    public static void main(String[] args) {
    }


    static class Solution {
        public int reverse(int x) {
            String str = String.valueOf(x);
            String resultStr ="";

            String answer ="";

            boolean isMinus = false;

            if(str.charAt(0) == '-') {
                isMinus = true;
                str = str.substring(1);
            }

            for(int i=str.length()-1; i >=0; i--){
                resultStr += String.valueOf(str.charAt(i));
            }

            Long resultLong = Long.parseLong(resultStr);
            if(isMinus) resultLong *= -1;

            if(resultLong > Integer.MAX_VALUE || resultLong < Integer.MIN_VALUE) { return 0; }

            return resultLong.intValue();
        }
    }
}

