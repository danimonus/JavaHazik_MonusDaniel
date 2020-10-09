package F3;

/**
 * Teszt osztály.
 */

import java.util.Arrays;

public class Teszt {

    
    public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] v){
        int n = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) v[i];
                
                for (int j = 0; j < k.getSorlap().length; j++) {
                    if (k.getSorlap()[j].equals(ital)) {
                        n++;
                        //break;
                    }
                }
            }
        }
        
        Kocsma [] ko = new Kocsma[n];
        n = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) v[i];
                for (int j = 0; j < k.getSorlap().length; j++) {
                    if (k.getSorlap()[j].equals(ital)) {
                        ko[n] = k; 
                        n++;
                           // break;
                    }
                }
            }
        }
        
        return ko;
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        VendeglatoipariEgyseg ve[] = new VendeglatoipariEgyseg[10];
        
        ve[0] = new Etterem("e1", 10, new String[] {"Pizza","Hamburger", "gyros"});
        ve[1] = new Etterem("e2", 14, new String[] {"Salata","Pizza","Porkolt"});
        ve[2] = new Etterem("e3", 15, new String[] {"Pizza", "Gyros","Olasz"});
        ve[3] = new Etterem("e4", 20, new String[] {"f1","f2","f3"});
        ve[4] = new Etterem("e5", 20, new String[] {"f3","f4","f5"});
        
        ve[5] = new Kocsma("k1", 20, new String[] {"i1","i2","i3"});
        ve[6] = new Kocsma("k2", 40, new String[] {"i3","i4","i5"});
        ve[7] = new Kocsma("k3", 43, new String[] {"i1","i3","i4"});
        ve[8] = new Kocsma("k4", 60, new String[] {"i3","i2","i4"});
        ve[9] = new Kocsma("k5", 80, new String[] {"i7","i5","i9"});
        
        
        Kocsma[] ko = adottItaltKinaloKocsmak("i3", ve);
        System.out.println(Arrays.toString(ko));
       // System.out.println(Arrays.toString(ko));
        
//        for(VendeglatoipariEgyseg word : ko) {
//            System.out.println(word.toString()); 
//        } 
    

    
    
    }


    
}
