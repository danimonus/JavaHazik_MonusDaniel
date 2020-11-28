package moziSztar2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author monus
 */



class film implements  Comparable<film>{
private String cim;
private List<szinesz> szereplok;

    public film(String cim) {
        this.cim = cim;
        this.szereplok = new ArrayList<szinesz>();
    }

    public String getCim() {
        return cim;
    }

    public List<szinesz> getSzereplok() {
        return szereplok;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof film)) {
            return false;
        }
        film f = (film) obj;
        return this.cim.equals(f.getCim());
}

    @Override
    public int compareTo(film t) {
        if (this.szereplok.size() == t.getSzereplok().size()) {
            return this.cim.compareTo(t.getCim());
        }else return (-1) * Integer.compare(this.szereplok.size(), t.getSzereplok().size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cim).append("\n");
        Collections.sort(szereplok);
        for (szinesz j : szereplok) {            
            sb.append(j + System.lineSeparator());
        }
        return sb.toString();
    }
    
    



} 

class szinesz implements Comparable<szinesz>{

    private String nev;
    private int szuletesiEv;

    public szinesz(String nev, int szuletesiEv) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
    }

    public String getNev() {
        return nev;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof szinesz)) {
            return false;
        }
        szinesz s = (szinesz) obj;
        return this.nev.equals(s.getNev());
    } 

    @Override
    public int compareTo(szinesz t) {
        if (this.szuletesiEv == t.getSzuletesiEv()) {
            return this.nev.compareTo(t.getNev());
        }else return Integer.compare(this.szuletesiEv, t.getSzuletesiEv());
    }

    @Override
    public String toString() {
        return this.szuletesiEv + ": " + this.nev;
    }

}


public class mozi2 {
    
    public static void main(String[] args) {
        
    

Scanner sc = new Scanner(System.in);
String sor = null;
String [] s = null;
List<film> flist = new ArrayList<>();

while(!(sor = sc.nextLine()).equals("vege")){

    s = sor.split("[():;]");
    film f;
 
    
    for (int i = 3; i < s.length; i++) {
    f = new film(s[i]);
        
        if (flist.contains(f)) {
            int index = flist.indexOf(f);
            flist.get(index).getSzereplok().add(new szinesz(s[0], Integer.parseInt(s[1])));
        }else{
            flist.add(f);
            f.getSzereplok().add(new szinesz(s[0], Integer.parseInt(s[1])));
        
        }

    }

}

Collections.sort(flist);
        for (film j : flist) {
            System.out.println(j);
        }

    
}
}