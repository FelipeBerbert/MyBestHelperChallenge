package vanhackathon2016.mybesthelperchallenge.models;

import android.content.Context;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Angelo on 21/05/2016.
 */
public class QuestionModel implements Serializable{

    private int id;

    private String text;

    private List<AnswerModel> answers;

    private int scene;

    public QuestionModel(int id, String text, List<AnswerModel> answers, int scene) {
        this.id = id;
        this.text = text;
        this.answers = answers;
        this.scene = scene;
    }

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

    public List<AnswerModel> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerModel> answers) {
        this.answers = answers;
    }

    public int getScene() {
        return scene;
    }

    public void setScene(int scene) {
        this.scene = scene;
    }
}