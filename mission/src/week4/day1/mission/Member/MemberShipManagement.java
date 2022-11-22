package week4.day1.mission.Member;

import week1.day5.question1.Grade;

public interface MemberShipManagement{
    void addMemberShip(int id, String name, GRADE grade);
    void showAllMember();
    boolean removeMember(int id);
}
