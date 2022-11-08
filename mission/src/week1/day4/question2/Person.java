package week1.day4.question2;

public class Person {
    private String name;
    private Age age;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Children children;

    public Person(String name) {
        this.name = name;
        this.age = new Age(30);
        gender = Gender.여성;
        maritalStatus = MaritalStatus.기혼자;
        children = new Children(1);
    }

    @Override
    public String toString() {
        return "이름은 " + name + "이고 나이는 " + age + "살 입니다." + "성별은 " + gender + "이며, "
                + maritalStatus + "입니다. " + "자녀는 " + children + "명이 있습니다.";
    }
}

class Age {
    private int age;

    public Age(int age) {
        if (age < 0) {
            throw new RuntimeException("나이는 0살부터 시작합니다. 올바른 값을 입력해주세요");
        }
        this.age = age;
    }
}

class Children {
    private int children;
    public Children(int children){
        if(children < 0){
            throw new RuntimeException("자식은 0명 이하일 수 없습니다. 올바른 값을 입력해주세요");
        }
        this.children = children;
    }
}


