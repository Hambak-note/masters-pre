package week4.day1.mission.question3;

import week1.day5.question1.Grade;
import week4.day1.mission.Member.GRADE;
import week4.day1.mission.Member.Member;
import week4.day1.mission.Member.MemberShipManagement;

import java.util.HashMap;
import java.util.Map;

public class MemberShipManagementMap implements MemberShipManagement {
    private static final Map<Integer, Member> memberShipMap = new HashMap<>();

    @Override
    public void addMemberShip(int id, String name, GRADE grade) {
        if(memberShipMap.containsKey(id)) {
            System.out.println("이미 있는 아이디 " + id + "의 값이 변경 됩니다.");
            System.out.println("==================================================");
        }
        memberShipMap.put(id, new Member(id, name, grade));
    }


    @Override
    public void showAllMember(){
        for (Member member : memberShipMap.values()) {
            System.out.println(member.getName() + " 님의 아이디는 "
                    + member.getId() + " 이고 등급은 "
                    + member.getGarde() + " 입니다.");
        }
        System.out.println("==================================================");
    }
    @Override
    public boolean removeMember(int id){
        if(!memberShipMap.containsKey(id)) {
            System.out.println(id + "에 해당하는 멤버가 없습니다.");
            System.out.println("==================================================");
            return false;
        }
        memberShipMap.remove(id);
        return true;
    }


}
