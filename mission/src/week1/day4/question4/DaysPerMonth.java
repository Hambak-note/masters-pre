package week1.day4.question4;

import java.util.HashMap;
import java.util.Map;

public class DaysPerMonth {

    Map<Integer, Integer> daysMap;
    boolean isLeapYear;

    public DaysPerMonth(boolean isLeapYear) {
        this.isLeapYear = isLeapYear;
        initMap(isLeapYear);
    }

    private void initMap(boolean isLeapYear){
        daysMap = new HashMap<>();
        daysMap.put(1, 31);
        daysMap.put(3, 31);
        daysMap.put(4, 30);
        daysMap.put(5, 31);
        daysMap.put(6, 30);
        daysMap.put(7, 31);
        daysMap.put(8, 31);
        daysMap.put(9, 30);
        daysMap.put(10, 31);
        daysMap.put(11, 30);
        daysMap.put(12, 31);
        if(isLeapYear){
            daysMap.put(2, 29);
            return;
        }
        daysMap.put(2, 28);
    }

    public int getDay(int month){
        return daysMap.get(month);
    }
}
