package ital;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    
 protected String név;
 protected String kiszerelés;
 protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }
 
 

    public void setNév(String név) {
        this.név = név;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + " dl, " + ár + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)){
            return false;
        }
        
        Ital i = (Ital) obj;
        
        return this.név.equals(i.név) && this.kiszerelés == i.kiszerelés;
       
    }

    @Override
    public int compareTo(Ital o) {
        Ital it = (Ital) o;
        
        if (this.ár == it.ár) {
            return 0;
        }
        else
            return 1;

    }

    

}
