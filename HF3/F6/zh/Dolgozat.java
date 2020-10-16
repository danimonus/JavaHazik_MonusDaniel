/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F6.zh;

import F6.egyetem.Pontozhato;

/**
 *
 * @author monus
 */
public class Dolgozat implements Pontozhato{
    
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    
    
    @Override
    public boolean megfelelt() {
        if (this.pontszam >= 35) {
            return true;
        }else if (this.pontszam == -1) {
            System.out.println("Nem írt!");
            return false;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "pontszam: " + pontszam;
    }
    
    
    
    
}
