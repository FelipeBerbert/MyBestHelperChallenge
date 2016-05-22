package vanhackathon2016.mybesthelperchallenge.models;

/**
 * Created by Angelo on 22/05/2016.
 */
public class RelativeCoordinate {

    public int reference;

    public int relativePosition;

    public RelativeCoordinate(int reference, int relativePosition) {
        this.reference = reference;
        this.relativePosition = relativePosition;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getRelativePosition() {
        return relativePosition;
    }

    public void setRelativePosition(int relativePosition) {
        this.relativePosition = relativePosition;
    }
}