package week3.day4.question2.grade_evaluation;

public class PassFailEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        String grade;

        if (point >= 70) {
            grade = "P";
        }else{
            grade = "F";
        }
        return grade;
    }
}
