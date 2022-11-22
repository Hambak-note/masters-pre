package week4.day1.mission.question1;

import week4.day1.mission.Member.GRADE;
import week4.day1.mission.Member.Member;
import week4.day1.mission.Member.MemberShipManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberShipManagementList implements MemberShipManagement {
    private static final List<Member> memberShipList = new ArrayList<>();
    private static final Map<Integer, Member> memberShipMap = new HashMap<>();

    @Override
    public void addMemberShip(int id, String name, GRADE grade){
        memberShipList.add(new Member(id, name, grade));
    }

    @Override
    public void showAllMember(){
        for (Member member : memberShipList) {
            System.out.println(member.getName() + " 님의 아이디는 "
                    + member.getId() + " 이고 등급은 "
                    + member.getGarde() + " 입니다.");
        }
        System.out.println("==================================================");
    }

    @Override
    public boolean removeMember(int id){
        for (Member member : memberShipList) {
            if(member.getId() == id){
                memberShipList.remove(member);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        System.out.println("==================================================");
        return false;
    }

}
