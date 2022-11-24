package week4.day3;

public class Question3 {

    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isPalindrome(int x) {

            String inputStr = String.valueOf(x);
            if (inputStr.charAt(0) == '-') {
                return false;
            }

            StringBuilder reverse = new StringBuilder();
            for (int i = inputStr.length() - 1; i >= 0; i--) {
                reverse.append(inputStr.charAt(i));
            }
            String reverseStr = reverse.toString();
            if (reverseStr.equals(inputStr)) {
                return true;
            }
            return false;
        }
    }
}

