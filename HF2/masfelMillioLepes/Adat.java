package masfelMillioLepes;

/**
 *Ember által megtett túra útvolakat modellez, a neve alapján majd az alapján, hogy országos túrtáról van e szó vagy pedig helyi
 * túráról.
 * @author monus
 */
public class Adat implements Comparable<Object>{

    private String nev;
    private int kekTura;
    private int helyiTura;

    public Adat(String nev, int kekTura, int helyiTura) {
        this.nev = nev;
        this.kekTura = kekTura;
        this.helyiTura = helyiTura;
    }

    public String getNev() {
        return nev;
    }

    public int getKekTura() {
        return kekTura;
    }

    public int getHelyiTura() {
        return helyiTura;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKekTura(int kekTura) {
        this.kekTura = kekTura;
    }

    public void setHelyiTura(int helyiTura) {
        this.helyiTura = helyiTura;
    }
    
    /**
     * Sorrendbe rakja a túrákat, elsőnek, hogy mennyi kék túrát tett meg majd az alpján, hogy mennyi helyi túrát 
     * majd pedig az ember neve alapján.
     * @param o
     * @return 
     */

    @Override
    public int compareTo(Object o) {
        Adat a = (Adat) o;
        
        if (this.kekTura == a.kekTura) {
            
            if (this.helyiTura == a.helyiTura) {
                return this.nev.compareTo(a.getNev());
            }
            else{
                return a.helyiTura - this.helyiTura;
            }
        }
        else{
            return a.kekTura - this.kekTura;
        }
   
    }

    @Override
    public String toString() {
        return this.nev;
    }
    
    
    
    
    


    
}
