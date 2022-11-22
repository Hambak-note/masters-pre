package week4.day2.question3;

import java.util.ArrayList;

public class StudentInformationManagement {

    private final ArrayList<Student> students;

    public StudentInformationManagement(){
        students = new ArrayList<>();
    }

    public void addStudent(String name, String major, String id, String avg){
        Integer convertId = Integer.valueOf(id);
        Double convertAvg = Double.valueOf(avg);
        students.add(new Student(name, major, convertId, convertAvg));
    }

    public void printAllStudent(){
        for (Student student : students) {
            System.out.println("이름 : " + student.getName());
            System.out.println("학과 : " + student.getMajor());
            System.out.println("학번 : " + student.getId());
            System.out.println("평균 : " + student.getAvg());
        }
    }

    public void printOneStudent(String name){
        for (Student student : students) {
            if ((student.getName()).equals(name)) {
                System.out.println(name + ", " + student.getMajor() +
                        ", " + student.getId() + ", " + student.getAvg());
                return;
            }

        }
        System.out.println("해당 하는 학생이 없습니다.");
    }
}
