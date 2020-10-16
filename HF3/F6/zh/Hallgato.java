package F6.zh;

import java.util.Random;

/**
 *
 * @author monus
 */
public class Hallgato {

private int mennyitKeszult;
private boolean sokatTanul;    

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

public Dolgozat dolgozatotIr(){
    int rand=0;
    int n=0;
    int irtDolgozatot = (int) (Math.random()*(100-0)+0);
    
    if (irtDolgozatot <= 98) {

            if (sokatTanul) {
                rand = (int) (Math.random() * (7-4)+4) * mennyitKeszult;               
            }
            if (!sokatTanul) {
                rand = (int) (Math.random() * (5-0)+0) * mennyitKeszult;
            }
    }
    else{
            rand = -1;
            System.out.println("Nem írt");
    }
        
    Dolgozat d = new Dolgozat(rand);
    return d;
}
    
}
