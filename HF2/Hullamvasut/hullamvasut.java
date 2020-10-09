package Hullamvasut;

/**
 * Egy hullamvasutat medellez a neve, vilag neve, legkisebb magassagaval illetve a várakozási idejével.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author monus
 */
public class hullamvasut implements Comparable<Object>{

private String hullamvasutNeve;
private String vilagNeve;
private int legkissebbMagassag;
private int varakozasiIdo;

    public hullamvasut(String hullamvasutNeve, String vilagNeve, int legkissebbMagassag, int varakozasiIdo) {
        this.hullamvasutNeve = hullamvasutNeve;
        this.vilagNeve = vilagNeve;
        this.legkissebbMagassag = legkissebbMagassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public String getHullamvasutNeve() {
        return hullamvasutNeve;
    }

    public String getVilagNeve() {
        return vilagNeve;
    }

    public int getLegkissebbMagassag() {
        return legkissebbMagassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    public void setHullamvasutNeve(String hullamvasutNeve) {
        this.hullamvasutNeve = hullamvasutNeve;
    }

    public void setVilagNeve(String vilagNeve) {
        this.vilagNeve = vilagNeve;
    }

    public void setLegkissebbMagassag(int legkissebbMagassag) {
        this.legkissebbMagassag = legkissebbMagassag;
    }

    public void setVarakozasiIdo(int varakozasiIdo) {
        this.varakozasiIdo = varakozasiIdo;
    }

    
    
    /**
     * A vasutakat állitja sorrendbe a megadott szempontok alapján. Amelyek a várakozási idő
     * legkissebb magasság majd név alapán.
     * @param o
     * @return 
     */
        @Override
    public int compareTo(Object o) {
        hullamvasut hv = (hullamvasut) o;

            if (this.varakozasiIdo == hv.varakozasiIdo) {
                if (this.legkissebbMagassag == hv.legkissebbMagassag) {
                    
                    return this.hullamvasutNeve.compareTo(hv.hullamvasutNeve);
                }
                else{
                        return hv.legkissebbMagassag - this.legkissebbMagassag;
                }
            }
            else
                return this.varakozasiIdo - hv.varakozasiIdo;

    }

    @Override
    public String toString() {
        return hullamvasutNeve + " (" + vilagNeve + "): " + varakozasiIdo;
    }


    
}
