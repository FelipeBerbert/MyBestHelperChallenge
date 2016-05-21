package vanhackathon2016.mybesthelperchallenge.models;

import java.io.Serializable;

/**
 * Created by Angelo on 21/05/2016.
 */
public class ClientModel implements Serializable {

    private int id;

    private String name;

    private ArchetypeModel archetypeId;

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

    public ArchetypeModel getArchetypeId() {
        return archetypeId;
    }

    public void setArchetypeId(ArchetypeModel archetypeId) {
        this.archetypeId = archetypeId;
    }
}