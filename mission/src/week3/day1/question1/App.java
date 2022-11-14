package week3.day1.question1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {

    private static ArrayList<Member> memberList;

    public static void main(String[] args) {
        initMemberList();
        printMemberList();

    }

    private static void initMemberList(){
        memberList = new ArrayList<>();
        memberList.add(new RedMember("James", 10000, 2));
        memberList.add(new RedMember("Tomas", 30000, 2));
        memberList.add(new PlatinumMember("Edward", 10000, 2));
        memberList.add(new PlatinumMember("Percy", 30000, 2));
        memberList.add(new DiamondMember("Elizabet", 30000, 2));
    }

    private static void printMemberList(){
        for (Member member : memberList) {
            member.printStatus();
            System.out.println();
        }
    }
}
