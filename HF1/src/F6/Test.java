package F6;
/**
 * LinearEquation osztaly teszt osztalya.
 * @author monus
 */

public class Test {

    public static void main(String[] args) {
        
        LinearEquation le1 = new LinearEquation(2, 6, 12, 20, 23, 43);
        LinearEquation le2 = new LinearEquation(0, 0, 0, 0, 0, 0);
        LinearEquation le3 = new LinearEquation(10, 12, 4, 7, 21, 3);
        
        System.out.println(le1);
        System.out.println(le2);
        System.out.println(le3);
        
    } 

    
}
