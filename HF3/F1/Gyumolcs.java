package F1;


/**
 *Gyümölcsöt modellez a fajtaja és az íze alapján.
 * @author monus
 */
public class Gyumolcs {

private String fajta;
private String iz;

    public Gyumolcs(String f, String i) {
        this.fajta = fajta;
        this.iz = iz;
    }

    public String milyenFajta() {
        return fajta;
    }

    public String milyenIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return "fajta=" + fajta + ", iz=" + iz;
    }




    
}
