package vanhackathon2016.mybesthelperchallenge.models;

import java.io.Serializable;

/**
 * Created by Angelo on 21/05/2016.
 */
public class ClientModel implements Serializable {

    private int id;

    private String name;

    private Archetype archetypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Archetype getArchetypeId() {
        return archetypeId;
    }

    public void setArchetypeId(Archetype archetypeId) {
        this.archetypeId = archetypeId;
    }
}