package F8;

/**
 * Egy katonát modellez támadó és védőerő alapján.
 * @author monus
 */

public class Katona {

private double tamadoEro;
private double vedoEro;

    public Katona() {
        this.tamadoEro = 5.5;
        this.vedoEro = 5.5;
    }

    public Katona(double tamadoEro, double vedoEro) {
        this.tamadoEro = tamadoEro;
        this.vedoEro = vedoEro;
    }

    public double getTamadoEro() {
        return tamadoEro;
    }

    public double getVedoEro() {
        return vedoEro;
    }

    public void setTamadoEro(double tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    public void setVedoEro(double vedoEro) {
        this.vedoEro = vedoEro;
    }

    @Override
    public String toString() {
        return "TE: " + tamadoEro + ", VE: " + vedoEro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    /**
     * Eguals metódus amely két katona objektumot hasonlit őssze a tamadó és a védő ereje alapján.     
     * @param obj
     * @return 
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Katona)) {
            return false;
        }
        
        Katona k = (Katona) obj;
        
        return this.tamadoEro==k.getTamadoEro() && this.vedoEro==k.getVedoEro();
    
    }
    
    




    
}
