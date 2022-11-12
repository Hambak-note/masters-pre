package week2.day4.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    private int id;
    private String name;
    private String major;
    private Map<Integer, Score> scores;

    public Student(int id, String name, String major, int numberOfSubject) {
        this.id = id;
        this.name = name;
        this.major = major;
        initScore(numberOfSubject);

    }

    private void initScore(int numberOfSubject){
        scores = new HashMap<>();
        for(int i = 1; i <= numberOfSubject; i++){
            scores.put(i, new Score(-1));
        }
    }

    public void addScore(int subjectId, int score){
        scores.put(subjectId, new Score(score));
    }

    public int getScores(int subjectId) {
        Score s = scores.get(subjectId);
        int score = s.getScore();
        return score;
    }

    public void printStudentState(){
        System.out.println(name + " 햑생은 " + scores.size() + "과목을 수강했습니다");
        System.out.println();
    }

    public String getName() { return name; }

    public int getSubjectCount(){
        int count = 0;
        for (Integer integer : scores.keySet()) {
            int score = scores.get(integer).getScore();
            if(score == -1) continue;
            count++;
        }
        return count;
    }

    public int getTotal(){
        int total = 0;
        for (Integer integer : scores.keySet()) {
            int score = scores.get(integer).getScore();
            if(score == -1) continue;
            total += score;
        }
        return total;
    }

    public double getAverage(){
        return getTotal() / (double) getSubjectCount();
    }

    @Override
    public String toString() {
        String output = name + ":" + id + ":" + major + ":";
        for (Integer key : scores.keySet()) {
            output += (scores.get(key).getScore()) + ":";
        }
        return output;
    }
}
