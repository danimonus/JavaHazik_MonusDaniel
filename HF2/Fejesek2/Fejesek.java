package Fejesek2;

/**
 * Egy tornasort modellez. A gyerek nevét és az előtte lévő gyerek nevét. 
 * @author monus
 */
public class Fejesek {

    private String nev;
    private String elotte;

    public Fejesek(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }
    
    

    public String getNev() {
        return nev;
    }

    public String getElotte() {
        return elotte;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setElotte(String elotte) {
        this.elotte = elotte;
    }
    
    


    
}
