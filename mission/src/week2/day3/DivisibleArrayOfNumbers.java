package week2.day3;

import java.util.ArrayList;
import java.util.Collections;

public class DivisibleArrayOfNumbers {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> divisibleList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                divisibleList.add(arr[i]);
        }

        if(divisibleList.isEmpty() == true){
            answer = new int[]{-1};
            return answer;
        }

        Collections.sort(divisibleList);


        answer = divisibleList.stream().mapToInt(i->i).toArray();

        return answer;
    }
}