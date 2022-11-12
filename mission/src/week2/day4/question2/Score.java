package week2.day4.question2;

public class Score {

    private int score;

    public Score(int score) {
        if(isValidScore(score)) this.score = score;
    }

    public int getScore() {
        return score;
    }

    private boolean isValidScore(int score){
        if(score == -1) return true;
        if(score > 100 || score < 0){
            System.out.println("점수는 0 ~ 100점 사이로 입력해주세요");
            return false;
        }
        return true;
    }
}
