package Hullamvasut;

/**
 * Hullamvasutak tesztosztálya.
 */
import java.util.ArrayList;
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
        n = Integer.parseInt(sc.nextLine());
        hullamvasut [] hullam = new hullamvasut[n];
        
        for (int i = 0; i < n; i++) {
            String sor = sc.nextLine();
            String[] s = sor.split(";");
            hullam [i] = new hullamvasut(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]));  
        }
        
        Arrays.sort(hullam);
        
        for (int i = 0; i < n; i++) {
            System.out.println(hullam[i]);
        }
        
        
        
        
    }


    
}
