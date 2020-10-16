
package F1;

/**
 *Tartalmazza az AlkoholosItal osszes metódusát és adatmezejét. Ha bor objektumot 
 * akarunk létrehozni akkor a szolo fajtajat és a termő területét is meglehet adni.
 * @author monus
 */
public class Bor extends AlkoholosItal{
    
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(iz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    @Override
    public String mibolKeszult() {
        return "Szőlőből";
    }

    public String milyenSzolobolKeszult() {
        return szoloFajta;
    }

    public String holTermett() {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return szoloFajta + " bor ami " + termoTerulet + " -ban/-ben termett \n";
    }
    
    
    
}
