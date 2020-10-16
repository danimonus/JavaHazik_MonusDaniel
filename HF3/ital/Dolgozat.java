package ital;

import java.util.Arrays;

/**
 *
 * @author monus
 */
public class Dolgozat {

    public static SzeszesItal[] legnagyobbAlkohol(Ital[] it){
    int n = 0;
        
        for (int i = 0; i < it.length; i++) {
            if (it[i] instanceof SzeszesItal) {
                n++;
            }
            
           
            
        }
        
        SzeszesItal [] szeszes = new  SzeszesItal[n];
        n = 0;
            for (int j = 0; j < it.length; j++) {
                if (it[j] instanceof SzeszesItal) {
                    szeszes[n] = (SzeszesItal) it[j];
                    n++;
                }
            }
            SzeszesItal tmp;
        for (int i = 0; i < szeszes.length; i++) {
            for (int j = i+1; j < szeszes.length; j++) {
                if (szeszes[i].getAlkoholTartalom() < szeszes[j].getAlkoholTartalom()) {
                    tmp = szeszes[i];
                    szeszes[i] = szeszes[j];
                    szeszes[j] = tmp;
                }
            }
        }
        
         
        SzeszesItal [] vissza = new SzeszesItal[3];
        
        for (int i = 0; i < 3; i++) {
            vissza[i] = szeszes[i];

        }       
        if (n<=2) {
            return null;
        }else
        return szeszes;
    }
    
    
    public static void main(String[] args) {
        
        Ital [] ital = new Ital[5];
        
        ital[0] = new Ital("Coca-Cola", "5", 350);
        ital[1] = new SzeszesItal("Ikon bor", "0.7", 1400, 13);
        ital[2] = new SzeszesItal("Bodri bor", "0,7", 1700, 12);
        ital[3] = new SzeszesItal("Henessy", "0,5", 8000, 40);
        ital[4] = new Ital("Szentkirályi", "5", 150);
        
        SzeszesItal[] si = legnagyobbAlkohol(ital);
        
        
        for(SzeszesItal s : si)
            System.out.println(s);
    
    
        Ital tmp;
        for (int i = 0; i < ital.length; i++) {
            for (int j = i+1; j < ital.length; j++) {
                if (ital[i].getÁr() < ital[j].getÁr()) {
                    tmp = ital[i];
                    ital[i] = ital[j];
                    ital[j] = tmp;
                }
            }
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < ital.length; i++) {
            System.out.println(ital[i]);
        }
    
    }
    
        

    
}
