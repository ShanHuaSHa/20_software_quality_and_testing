package cn.cstqb.exam.testmaker.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exampaper_questions")
public class ExamPaperQuestions extends AbstractEntity{

    private int exampaper_id;

    private int question_id;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Override
    public boolean validate() {
        return true;
    }

    public int getExampaper_id() {
        return exampaper_id;
    }

    public void setExampaper_id(int exampaper_id) {
        this.exampaper_id = exampaper_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamPaperQuestions that=(ExamPaperQuestions)o;

        return Objects.equals(this.exampaper_id,that.exampaper_id)&&
                Objects.equals(this.question_id,that.question_id);
    }
}
