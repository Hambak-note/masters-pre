package week1.day5.question1;

public class Grade {
    private int mathScore;
    private int scienceScore;
    private int englishScore;

    public Grade(int mathScore, int scienceScore, int englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    public double scoreAverage(){
        return (mathScore+scienceScore+englishScore) / (double)3;
    }
}
