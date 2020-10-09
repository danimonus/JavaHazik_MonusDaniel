package izzasztoFeladat;

/**
 *A városokat és azoknak a hőmérsékletét modellezi. 
 * @author monus
 */
public class Adat implements Comparable<Object>{

private String varos;
private int fok;

    public Adat(String varos, int fok) {
        this.varos = varos;
        this.fok = fok;
    }

    public String getVaros() {
        return varos;
    }

    public int getFok() {
        return fok;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public void setFok(int fok) {
        this.fok = fok;
    }

    /**
     * Sorrendbe rakja az elemekt, elsőnek fok alapján majd ha egyezés lenne akkor a város neve alapján.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        Adat a = (Adat) o;

        if (this.fok == a.fok) {
            return this.varos.compareTo(a.getVaros());
        } else {
             return a.fok - this.fok;
            
        }

    }

    @Override
    public String toString() {
        return varos + " (" + fok + ")";
    }
    
    



    
}
