package week3.day4.question2.domain;

import week3.day4.question2.grade_evaluation.BasicEvaluation;
import week3.day4.question2.grade_evaluation.GradeEvaluation;
import week3.day4.question2.grade_evaluation.MajorEvaluation;
import week3.day4.question2.grade_evaluation.PassFailEvaluation;

import java.util.List;

public class Report {

    private StringBuilder sb;
    private GradeEvaluation gradeEvaluation;


    public StringBuilder printResult(Course course){
        sb = new StringBuilder();

        sb.append(course.getCourseName() + " 수강생 학점\n");
        sb.append("이름 | 학번 | 중점과목 | 점수\n");
        List<Student> studentList = course.getStudentList();
        for (Student student : studentList) {
            String majorRequiredCourseName = student.getMajor().getMajorRequiredCourse().getCourseName();
            Score score = student.getScore(course);
            sb.append(student.getName() + " | " + student.getStudentId() + " | " + majorRequiredCourseName + " | "
                    + score.getPoint() + ":"+score.getGrade()+" |\n");
        }

        return sb;
    }


    public String calculateGrade(Student student, Course course, int point){
        Major major = student.getMajor();
        Course majorRequiredCourses = major.getMajorRequiredCourse();

        if(course.getPassFail() == true){
            gradeEvaluation = new PassFailEvaluation();
            return gradeEvaluation.getGrade(point);
        }

        if(majorRequiredCourses.equals(course)){
            gradeEvaluation = new MajorEvaluation();
            return gradeEvaluation.getGrade(point);
        }
        gradeEvaluation = new BasicEvaluation();
        return gradeEvaluation.getGrade(point);
    }
}
