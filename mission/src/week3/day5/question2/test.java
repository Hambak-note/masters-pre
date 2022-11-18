package week3.day5.question2;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();

        testMap.put("Test", "Test");
        testMap.remove("Test");
        System.out.println(testMap.containsKey("Test"));
    }
}
