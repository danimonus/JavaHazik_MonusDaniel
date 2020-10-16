package F3;

import java.util.Arrays;

/**
 * Örökli a VendeglatoipariEygsegtöl az összes hozzáférhető adatmezőt és metódust.
 * Létrehoz egy sorlap nevü String tömböt.
 * @author monus
 */

public class Kocsma extends VendeglatoipariEgyseg{

private String[] sorlap;

    public Kocsma(String nev, int ferohelyekSzama,String[] sorlap) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {               
        //return "sorlap=" + sorlap + " " + super.getNev() + "\n";
    
         return super.toString() + " Sörlap:" + Arrays.toString(sorlap) + "\n";
    }

    


    
}
