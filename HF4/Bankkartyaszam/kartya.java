package Bankkartyaszam;

import java.util.Scanner;

/**
 *
 * @author monus
 */
public class kartya {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        
        while(!(sor = sc.nextLine()).equals("vege")){
        
        int osszeg = 0;
        
            for (int i = sor.length()-1; i >= 0 ; i--) {
                if (sor.charAt(i) % 2 == 0) {
        int dupla = sor.charAt(i)*2;            
                    if (dupla > 9) {
                        dupla -= 9;
                    }
                    
                    osszeg += dupla;
                }
            }
            
            if (osszeg % 2 == 0) {
                System.out.println("YES");
            }else
                System.out.println("NO");
        
        
        }

    }

}
