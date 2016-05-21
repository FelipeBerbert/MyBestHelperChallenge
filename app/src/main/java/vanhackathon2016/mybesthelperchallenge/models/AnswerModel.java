package vanhackathon2016.mybesthelperchallenge.models;

import java.io.Serializable;

/**
 * Created by Angelo on 21/05/2016.
 */
public class AnswerModel implements Serializable{

    private int id;

    private String text;

    private int idQuestion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

}