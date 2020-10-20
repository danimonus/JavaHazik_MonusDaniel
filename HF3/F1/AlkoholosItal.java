
package F1;

/**
 *Örökli az Ital osztály összes metódsuát és adatemezejét. Az alkoholos ital izét
 * és alkoholtartalmát írja le.
 * @author monus
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    public String milyenIzu() {
        return iz;
    }

    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return iz + ", " + alkoholTartalom;
    }
    
    
    
}
