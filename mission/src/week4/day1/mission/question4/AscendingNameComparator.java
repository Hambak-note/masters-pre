package week4.day1.mission.question4;

import week4.day1.mission.Member.Member;

import java.util.Comparator;

public class AscendingNameComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        return o1.getName().compareTo(o2.getName());
    }
}