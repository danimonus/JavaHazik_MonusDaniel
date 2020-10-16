package F6.zh;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Teszt{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean tanult = false;
        String sor = null;
        String s[] = null;
        n = Integer.parseInt(sc.nextLine());
        Hallgato[] h = new Hallgato[n];
        try{
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(" ");            
            if (s[1].equals("igaz")) {
                tanult = true;
            }else 
                tanult = false;
            
            h[i] = new Hallgato(Integer.parseInt(s[0]), tanult);

        }
        
        
        
        
        for (int i = 0; i < h.length; i++) {                      
           
           boolean d1 = h[i].dolgozatotIr().megfelelt();
           boolean d2 = h[i].dolgozatotIr().megfelelt(); 
        
            if (d1 && d2) {
                System.out.println("Megfelelt!");
            }else   
                System.out.println("Nem felelt meg!");
        }
        
        }catch(Exception e){
            e.getStackTrace();           
        }
    }


    
}
