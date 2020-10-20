package F1;


/**
 *Tartalmazza a Gyumolcs osszes metódusát és adatmezejét.
 * alkoholTartalom adatmenővel rendelkezik.
 * @author monus
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{

private double alkoholTartalom;

    public ErjedtGyumolcs(String f, String i,double alkoholTartalom) {
        super(f, i);
        this.alkoholTartalom = alkoholTartalom;
    }

    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "alkoholTartalom=" + alkoholTartalom;
    }



    
}
