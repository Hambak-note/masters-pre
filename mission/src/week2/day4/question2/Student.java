package week2.day4.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int id;
    private String majors;
    private ArrayList<Integer> grades;

    public Student(String name, int id, String majors, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.majors = majors;
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private int calculateTotal(){
        int total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return total;
    }

    private double calculateAvg(){
        return calculateTotal() / (double) grades.size();
    }

    public void printStudentState(){
        System.out.println(name + "학생은 " + grades.size() + "과목을 수강했습니다.");
        System.out.println("총점은 " + calculateTotal() + "점이고 평균은 "+ calculateAvg() + "입니다.");
        System.out.println("===============================");
    }
}
