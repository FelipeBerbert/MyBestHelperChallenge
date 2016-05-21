package vanhackathon2016.mybesthelperchallenge.models;

import java.io.Serializable;

/**
 * Created by Angelo on 21/05/2016.
 */
public class ArchetypeModel implements Serializable {

    private int id;

    private String text;

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
}