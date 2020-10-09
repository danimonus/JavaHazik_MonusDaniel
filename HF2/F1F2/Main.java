package F1F2;

/**
 * Teszt osztály ahol a geometriai alakzatokat példányositjuk.
 * @author monus
 */

public class Main {

 public static void main(String[] args) {
 Circle circle = new Circle(1.0);
 System.out.println("A circle " + circle.toString());
 System.out.println("The radius is " + circle.getRadius());
 System.out.println("The area is " + circle.getArea());
 System.out.println("The diameter is " + circle.getDiameter());
 

 Rectangle rectangle = new Rectangle(2.0, 4.0);
 System.out.println(System.getProperty("line.separator") + "A rectangle " +
rectangle.toString());
 System.out.println("The area is " + rectangle.getArea());
 System.out.println("The perimeter is " + rectangle.getPerimeter());
     System.out.println("\n");
 
 
 Triangle t1 = new Triangle(1, 1.5, 1, "yellow", true);
     System.out.println(t1.toString() + "\nArea=" + t1.getArea() + " Perimeter=" + t1.getPerimeter() + "\n" + t1.getColour()
     + ", " + t1.isFilled());
 
 }
}
    

