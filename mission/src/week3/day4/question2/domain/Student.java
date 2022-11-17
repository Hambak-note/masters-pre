package week3.day4.question2.domain;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private Integer studentId;
    private Major major;

    private Map<Course, Score> scoreByCourse;


    public Student(String name, Integer studentId, Major major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        scoreByCourse = new HashMap<>();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Major getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public void addScore(Course course, Score score){
        scoreByCourse.put(course, score);
    }

    public Score getScore(Course course) {
        return scoreByCourse.get(course);
    }

}
