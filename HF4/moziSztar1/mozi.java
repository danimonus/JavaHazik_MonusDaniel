package moziSztar1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author monus
 */

class szinesz implements Comparable<szinesz>{

private String nev;
private List<film> film;

    public szinesz(String nev) {
        this.nev = nev;
        this.film = new ArrayList<film>();
    }

    public String getNev() {
        return nev;
    }

    public List<film> getFilm() {
        return film;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        
        if (this.film.size() == t.getFilm().size()) {
            return this.nev.compareTo(t.getNev());
        }
        return (-1) * Integer.compare(this.film.size(), t.getFilm().size());        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nev).append("\n");
        Collections.sort(film);
        for (film j : this.film) {
            sb.append(j).append("\n");
        }
        return sb.toString();
    }
}


class film implements Comparable<film>{
private String cim;
private int ev;

    public film(String cim, int ev) {
        this.cim = cim;
        this.ev = ev;
    }

    public String getCim() {
        return cim;
    }

    public int getEv() {
        return ev;
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
        if (this.ev == t.getEv()) {
            return this.cim.compareTo(t.getCim());
        }else return Integer.compare(this.ev, t.getEv());
    }

    @Override
    public String toString() {
        return ev + ": " + cim;
    }

}


public class mozi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = null;
        List<szinesz> slist = new ArrayList<>();

        while (!(sor = sc.nextLine()).equals("vege")) {
            szinesz m;
            String[] s = sor.split("[(:)]");
            String[] s2 = s[3].split(",");

            for (int i = 0; i < s2.length; i++) {
                m = new szinesz(s2[i]);

                if (slist.contains(m)) {                    
                    int index = slist.indexOf(m);
                    slist.get(index).getFilm().add(new film(s[0], Integer.parseInt(s[1])));
                } else {
                    slist.add(m);
                    m.getFilm().add(new film(s[0], Integer.parseInt(s[1])));

                }
            }
        }

        Collections.sort(slist);
        for (szinesz j : slist) {
            System.out.println(j.toString());
        }

    }

}
