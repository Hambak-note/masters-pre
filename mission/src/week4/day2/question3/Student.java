package week4.day2.question3;

public class Student {

    private String name;
    private String major;
    private Integer id;
    private Double avg;

    public Student(String name, String major, Integer id, Double avg) {
        this.name = name;
        this.major = major;
        this.id = id;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public Integer getId() {
        return id;
    }

    public Double getAvg() {
        return avg;
    }


}
