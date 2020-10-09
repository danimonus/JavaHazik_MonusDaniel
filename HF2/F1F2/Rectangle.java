package F1F2;

/**
 * A Rectangle osztály örökli az összes hozzáférhető adatmezőt és metódust
    a GeometricShape osztálytól.
* Tartalmazza a négyzet területét és kerületét visszaadó metódusokat.
 * @author monus
 */

public class Rectangle extends GeometricShape{

private double width;
private double height;

public Rectangle() {
        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * A négyzet területét adja vissza a két oldal szorzatával.
     * @return - négyzet területe. A = a * b.
     */
    
    public double getArea(){
    return this.height * this.width;
    }

    /**
     * A négyzet kerületét adja vissza.
     * @return - négyzet kerülete. P = 2 * (a + b).
     */
    
    public double getPerimeter(){
    return 2 * (this.height + this.width);
    }

    
}
