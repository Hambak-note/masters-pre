package week1.day3;

public class babbling1 {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    }

    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;

            String[] possibleStr = {"aya", "ye", "woo", "ma"};

            for (int i = 0; i < babbling.length; i++) {
                String currentStr = babbling[i];
                for(int j = 0; j < possibleStr.length; j++){
                    currentStr = currentStr.replace(possibleStr[j], " ");
                }
                currentStr = currentStr.replaceAll(" ", "");
                if(currentStr.length() == 0) answer++;
            }
            System.out.println(answer);
            return answer;
        }
    }
}

