package F5;

public class QuadraticEquation {

private int a;
private int b;
private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    /**
     * A masdofoku egyenlet diszkriminansat szamolja ki.
     * @return - Diszkriminast adja vissza diszkr = b^2 - 4ac
     */

public double getDiscriminant(){
//return Math.pow(b, 2) - 4 * (this.a*this.c);
return (b*b)-(4*a*c);
}

/**
 * A masodfoku egyenlet első gyökét adja vissza.
 * @return - első gyök
 */

public double getRoot1(){
    if (getDiscriminant()<0) {
        return 0;
    }
    else{
        return (-b+Math.sqrt(getDiscriminant())) / (2*this.a);
    }
}
/**
 * Másodfoku egyenlet második gyökét adja vissza
 * @return -második gyök
 */

public double getRoot2(){
    if (getDiscriminant()<0) {
        return 0;
    }
    else{
        return (-b-Math.sqrt(getDiscriminant())) / (2*this.a);
    }
}


/**
 * A kiirt szöveget megformázva adja vissza
 * @return - toString
 */

    @Override
    public String toString() {
        
        if (getDiscriminant() > 0) {
            return " root1=" + getRoot1() + " root2=" + getRoot2();       
        }
        else if (getDiscriminant() == 0) {
             return " root=" + getRoot1();
        }
        else
            
               return "The equation has no roots.";
        
    }
    

}
