package week3.day4.question2.domain;

import java.util.Map;

public class Major {

    private String majorName;
    private Course majorRequiredCourse;

    public Major(String majorName, Course majorRequiredCourse) {
        this.majorName = majorName;
        this.majorRequiredCourse = majorRequiredCourse;
    }


    public Course getMajorRequiredCourse() {
        return majorRequiredCourse;
    }
}
