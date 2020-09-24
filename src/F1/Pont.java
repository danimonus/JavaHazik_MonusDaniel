package F1;

/**
 * Egy pontot x és y koordinátáival leíró osztály.
 * @author monus
 */

public class Pont {

private double x;
private double y;

    /**
     * x,y argumentumokkal ellátott konstruktor
     * @param x
     * @param y 
     */
    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }



    
}
