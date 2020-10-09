package Budapest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int max = 0;
        int db = 0;
        n = Integer.parseInt(sc.nextLine());
        
        Tura [] tu = new Tura[n];
        
        
            while(db != n){
            String sor = sc.nextLine();            
            String[] s = sor.split(";");
                

              int osszeg = 0;
              for (int j = 4; j < s.length; j++) {
                osszeg += Integer.parseInt(s[j]);
            }
            
            if (osszeg > max) {
                max = osszeg;
            }
            
             Tura t = new Tura(s[0], s[1], s[2], s[3], osszeg);

            tu[db] = t;
            db++;
        }
            
            Arrays.sort(tu);
        
        
        for (int i = 0; i < db; i++) {
            if (tu[i].getResztav() == max) {
                System.out.println(tu[i]);
            }
        }
        
    }
    
}
