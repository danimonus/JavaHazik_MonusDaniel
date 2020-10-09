package F3;
/**
 * Örökli a VendeglatoipariEygsegtöl az összes hozzáférhető adatmezőt és metódust.
 * Létrehoz egy étlap nevü String tömböt.
 * @author monus
 */

public class Etterem extends VendeglatoipariEgyseg{
private String[] etlap;

    public Etterem(String nev, int ferohelyekSzama, String[] etlap) {
        super(nev, ferohelyekSzama,false);      
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "etlap=" + etlap;
    }




    
}
