package F3;

public class Rectangle {

public double width;
public double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double height,double width) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * Visszaadja a téglalap területét. 
     * @return - Téglalap területe. T = h*w;
     */
    
    public double getArea(){
    return this.height*this.width;
    }
    
    /**
     * Visszaadja a téglalap kerületét.
     * @return - Téglalap területe. K = 2*(h+w);
     */
    
    public double getPerimeter(){
    return 2 * (this.height+this.width);
    }

    /**
     * Visszaadja a formázott stringet.
     * @return - toString
     */
    
    @Override
    public String toString() {
        return "width=" + width + ", height=" + height + " Area="
                + getArea() + " Perimeter=" + getPerimeter();
    }

    


    
}
