package week4.day1.mission.Member;

public class Member implements Comparable<Member>{

    private int id;
    private String name;
    private GRADE garde;

    public Member(int id, String name, GRADE garde) {
        this.id = id;
        this.name = name;
        this.garde = garde;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GRADE getGarde() {
        return garde;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            return this.id == member.id;
        }

        return false;
    }

    @Override
    //id 순 비교
    public int compareTo(Member o) {
        if(this.id < o.getId()){
            return -1;
        } else if (this.id == o.getId()) {
            return 0;
        }
        return 1;
    }
}
