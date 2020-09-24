package F4;

/**
 * Egy üditős dobozt leíró osztály, jellemezve a nevével a kiszereléssel 
 * az araval és a gyartasi datumaval.
 */

import java.util.Date;
import java.util.Objects;

public class Ital {

protected String nev;
protected String kiszereles;
private static int ar;
protected Date gyartasiDatum;

/**
 * nev és kiszerelés argumentummal ellátott konstruktor, törzsében a datumnak a jelenlegi datumot adja meg
 * arnak pedig alapértelmezetten 10-et ad meg.
 * @param nev
 * @param kiszereles 
 */
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

    /**
     * toString formázott kiiratása
     * @return - toString
     */
    
    @Override
    public String toString() {
        return nev + ", " + kiszereles + " dl, " + getAr() + " Ft";
    }

   /**
    * Osszehasonlitja az objektumokat nev,kiszerelés és dátum szerint
    * @param obj
    * @return - ha megegyezik akkor true amúgy false
    */

    @Override
    public boolean equals(Object obj) {    
        if (obj == null && !(obj instanceof Ital)) {
            return false;
        }
       
        Ital i = (Ital) obj;
        
        return this.gyartasiDatum.equals(i.getGyartasiDatum()) && this.kiszereles == i.getKiszereles()
                && this.nev.equals(i.getNev());
    }

    /**
     * Kiszámolja a Ft árat Euróban
     * @return - ar/345-el azaz euróban írja ki az árat
     */
    
    public static int getArEuroban(){
    return getAr()/345;
    }
    

}
