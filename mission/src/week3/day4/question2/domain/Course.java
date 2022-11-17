package week3.day4.question2.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

    private Integer courseId;
    private String courseName;
    private List<Student> studentList;
    private Boolean isPassFail;

    public Course(String courseName, Boolean isPassFail) {
        this.courseName = courseName;
        this.isPassFail = isPassFail;
        studentList = new ArrayList<>();
    }

    public Boolean getPassFail() {
        return isPassFail;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
