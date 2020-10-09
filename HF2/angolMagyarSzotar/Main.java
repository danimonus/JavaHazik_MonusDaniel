package angolMagyarSzotar;

/**
 * Adat osztály tesztosztálya.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String [] s;
        int n = Integer.parseInt(sor);
        Adat[] adat = new Adat[n];
        
        
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(":");
            
            adat[i] = new Adat(s[0], s[1]);
        }
        
        Arrays.sort(adat);
        
        
        for(Adat i : adat){
            System.out.println(i);
        }
        
        
    }

    
}
