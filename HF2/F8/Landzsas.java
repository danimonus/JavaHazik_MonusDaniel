package F8;

/**
 * Megörökli a katona osztály összes metódusát és adatmezőjét. Illetve a Landzsas rendelkezik még egy dobotáv 
 * adatmezővel is. 
 * @author monus
 */

public class Landzsas extends Katona{

private double dobotav;

    public Landzsas(double dobotav) {
        this.dobotav = dobotav;
    }

    public Landzsas(double tamadoEro, double vedoEro,double dobotav) {
        super(tamadoEro, vedoEro);
        this.dobotav = dobotav;
    }

    public double getDobotav() {
        return dobotav;
    }

    public void setDobotav(double dobotav) {
        this.dobotav = dobotav;
    }

    @Override
    public String toString() {
        return "Landzsas:" + "TE: " + this.getDobotav() + " VE: " + this.getVedoEro();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.dobotav) ^ (Double.doubleToLongBits(this.dobotav) >>> 32));
        return hash;
    }

    /**
     * Equals metódus amely két lándzsást hasonlit össze dobotáv iletve az örökölt tamadóerő és 
     * vedőerő alapján.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null && !(obj instanceof Landzsas)) {
            return false;
        }

        Landzsas l = (Landzsas) obj;
        
        return this.dobotav==l.getDobotav() && 
                this.getTamadoEro()==l.getTamadoEro() && this.getVedoEro()==l.getVedoEro();
    }

    
    
    

    
}
