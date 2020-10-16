package F1;

import java.util.Arrays;

/**
 *F1 osztály tesztosztálya.
 * @author monus
 */
public class Main {
    
 public static Aszu [] vissza(Bor[] a){
        int n = 0;
    
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Aszu) {
                Aszu aszu = (Aszu) a[i];
                for (int j = 0; j < a.length; j++) {
                    if (aszu.hanyPuttonyos()==5) {
                        n++;
                        break;
                    }
                }
            }
            
        }
        
        Aszu [] Aszu = new Aszu[n];
        n=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Aszu) {
                Aszu aszu = (Aszu)a[i];
                for (int j = 0; j < a.length; j++) {
                    if (aszu.hanyPuttonyos()==5) {
                        Aszu[n++] = aszu;
                        break;
                    }
                }
            }
        }
            return Aszu;
        
    }
    

    public static void main(String[] args) {
        
        Bor [] bort = new Bor[5];
        
        bort[0] = new Aszu(5, "Tokaj", 13.5);
        bort[1] = new Bor("Vörös", "Eger", "Száraz", 13);
        bort[2] = new Aszu(3, "Tokaj", 12);
        bort[3] = new Bor("Fehér", "Balaton-felvidék", "Száraz", 12.5);
        bort[4] = new Aszu(5, "Tokaj", 13);
        
        Aszu [] a = vissza(bort);
        
        System.out.println(Arrays.toString(a));
        
    }

    
}
