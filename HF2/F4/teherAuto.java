package F4;

/**
 * Örökli az Auto osztáyltól az összes hozzáférhető adatmezőt és metódust.
 * Kiegészíti a maxSzallithatóTeher adatmezővel amely a teharautó tulajdonsága.
 * @author monus
 */

public class teherAuto extends Auto{

private int maxSzallithatoTeher;

    public teherAuto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "maxSzallithatoTeher=" + maxSzallithatoTeher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    /**
     * Equals metódus amely a teherautokat a maximalis szallitható teher 
     * illetve a rendszam alapjan hasonlitja össze;
     * @param obj
     * @return 
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null && !(obj instanceof teherAuto)) {
            return false;
        }
        
        teherAuto th = (teherAuto) obj;
        
        return (this.maxSzallithatoTeher == th.getMaxSzallithatoTeher()) && (super.getRendszam().equals(th.getRendszam()));
        
    }



    
}
