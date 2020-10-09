package F8;

/**
 * Megörökli a katona osztály összes metódusát és adatmezőjét. Illetve rendelkezik még egy 
 * Nyilast jellemző lotav adatmezővel. 
 * @author monus
 */

public class Nyilas extends Katona{

public double lotav;

    public Nyilas(double lotav) {
        this.lotav = lotav;
    }

    public Nyilas(double tamadoEro, double vedoEro,double lotav) {
        super(tamadoEro, vedoEro);
        this.lotav = lotav;
    }

    public double getLotav() {
        return lotav + super.getTamadoEro();
    }

    public void setLotav(double lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas:" + "TE: " + getLotav() + " VE: " + super.getVedoEro();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    /**
     * Equals metódus amely két nyilast hasonlit össze a lotva majd az örökölt 
     * vedőerő és tamadóerő alapjan. 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {       
        if (obj == null || !(obj instanceof Nyilas)) {
            return false;
        }
        Nyilas ny = (Nyilas) obj;
        
        return this.lotav == ny.getLotav() && 
                this.getVedoEro()==ny.getVedoEro() && this.getTamadoEro()==ny.getTamadoEro();
    
    }

    
    


    
}
