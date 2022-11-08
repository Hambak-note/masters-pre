package week1.day3;

public class nextNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(new int[]{1, 2, 3});
        System.out.println(answer);
    }

    static class Solution {
        public int solution(int[] common) {


            boolean isArithmeticSequence = true;

            int lastIndex = common.length - 1;

            int difference = common[1] - common[0];
            if(common[2] - common[1] == difference){
                return common[lastIndex] + difference;
            }
            return common[lastIndex] * (common[1]/common[0]);
        }
    }

}


