package F3;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author monus
 */
public class Auto implements Comparable<Auto>{

 private String rendszám;
 private int teljesítmény;
 private boolean automata;
 public static int objSzam;
 private List<String> extrak;

    public Auto(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        objSzam ++;
        this.extrak = new ArrayList<>();
    }

    public List<String> getExtrak() {
        return extrak;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    public int getObjSzam() {
        return objSzam;
    }
    
   

    @Override
    public String toString() {
        return rendszám + " " + teljesítmény + " " + automata;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Auto)) {
            return false;
        }
        
        Auto a = (Auto) obj;
        
        return this.rendszám.equals(a.getRendszám());
            
        }

    @Override
    public int compareTo(Auto o) {
        
        if (this.teljesítmény == o.getTeljesítmény()) {
            return 0;
        }else if (this.teljesítmény > o.getTeljesítmény()) {
            return -1;
        }else if (this.teljesítmény < o.getTeljesítmény()) {
            return 1;
        }
        else return -100;
    }

public boolean rendszame(String s){
        int b = 0;
        int n = 0;
    for (int i = 0; i < s.length(); i++) {        
     
        if (isDigit(s.charAt(i))) {
            n++;
        }else if (isLetter(s.charAt(i))) {
            b++;
        }
        
    }
    
    if (b==3 && n == 3) {
        return true;
    }else
        return false;
    
    
}


}





 
 


    

