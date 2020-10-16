package Fejesek;

/**
 *
 * @author monus
 */
public class Csapat {

private String csapatNev;
private int osszgol;
private int szabadrugas;
private int bunteto;
private int akcio;

    public Csapat(String csapatNev, int osszgol, int szabadrugas, int bunteto, int akcio) {
        this.csapatNev = csapatNev;
        this.osszgol = osszgol;
        this.szabadrugas = szabadrugas;
        this.bunteto = bunteto;
        this.akcio = akcio;
    }

    public String getCsapatNev() {
        return csapatNev;
    }

    public int getOsszgol() {
        return osszgol;
    }

    public int getSzabadrugas() {
        return szabadrugas;
    }

    public int getBunteto() {
        return bunteto;
    }

    public int getAkcio() {
        return akcio;
    }

    public void setAkcio(int akcio) {
        this.akcio = akcio;
    }

    @Override
    public String toString() {
        return csapatNev + ": " + akcio;
    }

    
    


    
}
