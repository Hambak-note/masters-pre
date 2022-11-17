package week3.day4.question2.domain;

public class Score {
    private Integer point;
    private String grade;

    public Score(Integer point, String grade) {
        this.point = point;
        this.grade = grade;
    }

    public Integer getPoint() {
        return point;
    }

    public String getGrade() {
        return grade;
    }
}
