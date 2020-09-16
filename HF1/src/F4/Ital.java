package F4;

import java.util.Date;
import java.util.Objects;

public class Ital {

protected String nev;
protected String kiszereles;
private static int ar;
protected Date gyartasiDatum;

    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date();
        this.ar = 10;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    public void setGyartasiDatum(Date gyartasiDatum) {
        this.gyartasiDatum = gyartasiDatum;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + " dl, " + getAr() + " Ft";
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.kiszereles, other.kiszereles)) {
            return false;
        }
        if (!Objects.equals(this.gyartasiDatum, other.gyartasiDatum)) {
            return false;
        }
        return true;
    }

    public static int getArEuroban(){
    return getAr()/345;
    }
    

}
