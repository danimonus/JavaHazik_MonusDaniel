package F1F2;

/**
 * Örökölte az összes adatmezőt és metódsut a geometricShape osztályból.
 *  A kör területének, kerületének és átmérőjének az
    értékét adják vissza.
 * @author monus
 */

public class Circle extends GeometricShape{

private double radius;

public Circle() {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * Megadja a kör területét a pi segítségével.
     * @return - kör területe A = pi * r ^ 2.
     */
    
    public double getArea(){
    return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Megadja a kör kerületét.
     * @return - kör kerülete P = 2 * pi * R;
     */
    
    public double getPerimeter(){
    return 2 * Math.PI * this.radius;
    }
    
    /**
     * Visszaadja a kör átmérőjét a sugár segítségével.
     * @return - Kör átmérője D = 2 * r.
     */
    
    public double getDiameter(){
    return 2 * this.radius;
    }
    
}
