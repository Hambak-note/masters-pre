package week2.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TakeTwoAndAdd {

    public static void main(String[] args) {

    }

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = {};
            int sum = 0;
            Set<Integer> sumSet = new HashSet<>();
            for(int i=0; i < numbers.length-1; i++){

                for(int j=i+1; j <numbers.length; j++){
                    sumSet.add(numbers[i]+numbers[j]);
                }
            }

            ArrayList<Integer> sumList = new ArrayList<Integer>(sumSet);
            Collections.sort(sumList);
            answer = sumList.stream()
                    .mapToInt(i->i)
                    .toArray();

            return answer;
        }
    }
}
