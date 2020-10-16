package F1;

/**
 * Megörökli a Bor osztály összes metódusát és adatmezejét.
 * Ha Aszu típusu objektumot hozunk létre akkor megadhatjuk a puttonyszámát is.
 * @author monus
 */
public class Aszu extends Bor{
    
    private int puttonySzam;

    public Aszu(int puttonySzam, String termoTerulet, double alkoholTartalom) {
        super("Aszu", termoTerulet, "édes", alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }

    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return hanyPuttonyos()+" puttonyos "+
           super.toString()+"\n";
    }
    
    
    
    
}
