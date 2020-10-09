package angolMagyarSzotar;

/**
 *Egy angol magyar szotárt modellez. 
 * @author monus
 */
public class Adat implements Comparable<Object> {

private String angolSzo;
private String magyarSzo;

    public Adat(String angolSzo, String magyarSzo) {
        this.angolSzo = angolSzo;
        this.magyarSzo = magyarSzo;
    }

    public String getAngolSzo() {
        return angolSzo;
    }

    public String getMagyarSzo() {
        return magyarSzo;
    }

    public void setAngolSzo(String angolSzo) {
        this.angolSzo = angolSzo;
    }

    public void setMagyarSzo(String magyarSzo) {
        this.magyarSzo = magyarSzo;
    }

    
    /**
     * Sorrendbe teszi az elemeket lexikografikus sorrend alapján elsőnek az angol szókat
     * majd ha egyezés lenne akkor a magyar szó alapján.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        Adat a = (Adat) o;

        if (this.angolSzo.equals(a.angolSzo)) {

            return this.magyarSzo.compareTo(a.magyarSzo);

        } else {
            return this.angolSzo.compareTo(a.angolSzo);
        }

    }

    @Override
    public String toString() {
        return angolSzo + ":" + magyarSzo;
    }

    
    


    
}
