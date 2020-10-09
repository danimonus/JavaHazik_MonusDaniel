package masfelMillioLepes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Adat osztály tesztosztálya.
 * @author monus
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int n = Integer.parseInt(sor);
        
        Adat [] adat = new Adat[n];
        
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            String [] s = sor.split(";");
            String utvonal = s[1];
            int kek = 0;
            int helyi = 0;
            
            for (int j = 0; j < utvonal.length(); j++) {
                char c = utvonal.charAt(j);
                if (c == 'K') {
                    kek++;
                }
                else if(c == 'Z' || c == 'P' || c == 'S'){
                    helyi++;
                }
            }
            
            adat[i] = new Adat(s[0], kek, helyi);
        
        }
        
        Arrays.sort(adat);
        
        for (int i = 0; i < n; i++) {
            System.out.println(adat[i]);
        }
        
        
    }


    
}
