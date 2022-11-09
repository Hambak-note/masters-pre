package week2.day3;

public class SumOfFactors {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i=1; i<=n; i++){
                if(n%i==0)
                    answer += i;
            }
            return answer;
        }
    }
}
