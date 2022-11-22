package week4.day1.mission.question2;

import week4.day1.mission.Member.GRADE;
import week4.day1.mission.Member.Member;
import week4.day1.mission.Member.MemberShipManagement;

import java.util.HashSet;
import java.util.Set;

public class MemberShipManagementSet implements MemberShipManagement {

    private final static Set<Member> memberShipSet = new HashSet<>();
    @Override
    public void addMemberShip(int id, String name, GRADE grade) {
       if(!memberShipSet.add(new Member(id, name, grade))){
           System.out.println("이미 있는 아이디 " + id + "는 추가할 수 없습니다.");
           System.out.println("==================================================");
       }
    }

    @Override
    public void showAllMember() {
        for (Member member : memberShipSet) {
            System.out.println(member.getName() + " 님의 아이디는 "
                    + member.getId() + " 이고 등급은 "
                    + member.getGarde() + " 입니다.");
        }
        System.out.println("==================================================");
    }

    @Override
    public boolean removeMember(int id) {
        for (Member member : memberShipSet) {
            if(member.getId() == id) {
                memberShipSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        System.out.println("==================================================");
        return false;
    }
}
