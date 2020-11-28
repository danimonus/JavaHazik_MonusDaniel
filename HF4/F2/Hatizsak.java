
package F2;

import java.util.ArrayList;
import java.util.List;


public class Hatizsak implements Comparable<Hatizsak>{
    
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean vizhatlan;
    private List<String> hatizsakok;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
        this.hatizsakok = new ArrayList<>();
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    public List<String> getHatizsakok() {
        return hatizsakok;
    }

    @Override
    public int compareTo(Hatizsak t) {                
        int diff = 0;
        diff = this.marka.compareTo(t.getMarka());
        if (diff != 0) {
            return diff;
        }else return Double.compare(this.zsebekSzama, t.getZsebekSzama());
    }

    
    
    @Override
    public String toString() {
        return marka + ": " + zsebekSzama;
    }

    
    
    
    
}
