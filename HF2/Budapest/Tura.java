package Budapest;

/**
 *
 * @author monus
 */
public class Tura implements Comparable<Object>{

private String ev;
private String honap;
private String nap;
private String turaNeve;
private int resztav;

    public Tura(String ev, String honap, String nap, String turaNeve, int resztav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.turaNeve = turaNeve;
        this.resztav = resztav;
    }

    public String getEv() {
        return ev;
    }

    public String getHonap() {
        return honap;
    }

    public String getNap() {
        return nap;
    }

    public String getTuraNeve() {
        return turaNeve;
    }

    public int getResztav() {
        return resztav;
    }

    public void setEv(String ev) {
        this.ev = ev;
    }

    public void setHonap(String honap) {
        this.honap = honap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setTuraNeve(String turaNeve) {
        this.turaNeve = turaNeve;
    }

    public void setResztav(int resztav) {
        this.resztav = resztav;
    }

    @Override
    public String toString() {
        return ev + ";" + honap + ";" + nap + ";" + turaNeve;
    }

    @Override
    public int compareTo(Object o) {
        Tura t = (Tura) o;
        int tev = Integer.parseInt(t.ev);
        int thonap = Integer.parseInt(t.honap);
        int tnap = Integer.parseInt(t.nap);
        
        int utev = Integer.parseInt(this.ev);
        int uthonap = Integer.parseInt(this.honap);
        int utnap = Integer.parseInt(this.nap);
 
        
            if(utev == utev)
        {
            if(uthonap == uthonap)
            {
                if(utnap == utnap)
                {
                    return this.turaNeve.compareTo(t.getTuraNeve());
                }
                else return utnap - utnap;
            }
            else return uthonap - uthonap;
        }
        else return utev - utev;
    }
        
       


    
}
