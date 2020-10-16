package ital;

/**
 *
 * @author monus
 */
public class SzeszesItal extends Ital{
    
private double alkoholTartalom;

    public SzeszesItal(String név, String kiszerelés, int ár,double alkoholTartalom) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom = alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    
    
    
    @Override
    public String toString() {
        return alkoholTartalom + "% alkoholtartalmú " + super.getNév() + ", " + super.getKiszerelés()
                + "l, " + super.getÁr() + "Ft";
    }

   
   

    




    
}
