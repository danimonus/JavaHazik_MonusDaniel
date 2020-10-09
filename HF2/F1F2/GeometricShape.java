package F1F2;


/**
 * Geometria objektumok modellezésére jött létre.
 * Ez az osztály tartalmazza a color és filled tulajdonságokat, valamint az őket
    kezelő get és set metódusokat, ez az osztály tartalmazza
    a dateCreated tulajdonságot is, a getDateCreated() és toString() metódusokkal együtt.
 */

import java.util.Date;

public class GeometricShape {

private String colour;
private boolean filled;
private Date dataCreated;

    public GeometricShape() {
        this.colour = "white";
        this.filled = false;
        this.dataCreated = new Date();
    }

    public GeometricShape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "created on "  + dataCreated + " colour=" + colour + ", filled=" + filled;
    }

    
    


    
}
