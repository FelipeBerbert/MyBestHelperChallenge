package vanhackathon2016.mybesthelperchallenge.models;

import java.io.Serializable;

/**
 * Created by Angelo on 21/05/2016.
 */
public class AnswerModel implements Serializable {

    private int id;

    private String text;

    private int idQuestion;

    private RelativeCoordinate relativeCoordinateX;

    private RelativeCoordinate relativeCoordinateY;

    int relativeSize;

    public AnswerModel(int id, String text, RelativeCoordinate relativeCoordinateX, RelativeCoordinate relativeCoordinateY, int relativeSize) {
        this.id = id;
        this.text = text;
        this.relativeCoordinateX = relativeCoordinateX;
        this.relativeCoordinateY = relativeCoordinateY;
        this.relativeSize = relativeSize;
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

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public RelativeCoordinate getRelativeCoordinateX() {
        return relativeCoordinateX;
    }

    public void setRelativeCoordinateX(RelativeCoordinate relativeCoordinateX) {
        this.relativeCoordinateX = relativeCoordinateX;
    }

    public RelativeCoordinate getRelativeCoordinateY() {
        return relativeCoordinateY;
    }

    public void setRelativeCoordinateY(RelativeCoordinate relativeCoordinateY) {
        this.relativeCoordinateY = relativeCoordinateY;
    }

    public int getRelativeSize() {
        return relativeSize;
    }

    public void setRelativeSize(int relativeSize) {
        this.relativeSize = relativeSize;
    }
}