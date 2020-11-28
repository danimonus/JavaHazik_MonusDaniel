package F4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author monus
 */
public class Main {
    
    public static double atlagEletkor(HashSet<Hallgato> h){
        double osszeg = 0;
        double db = 0;
        
        Hallgato[] ha = new Hallgato[h.size()];
        h.toArray(ha);
        
        for (int i = 0; i < h.size(); i++) {
            if (ha[i].jokepessegu(ha[i])) {
                db++;
                osszeg += ha[i].getÉletkor();
            }
        }
        return osszeg/db;
    }

    public static void main(String[] args) {
        
        Szemely s1 = new Szemely("Mona Liza", 20, false);
        System.out.println(s1);
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String[] s = null;
        HashSet<Hallgato> hs = new HashSet<>();
        
        hs.add(new Hallgato("A", 20, true, 3.5));
        hs.add(new Hallgato("B", 22, false, 4.5));
        hs.add(new Hallgato("c", 25, true, 5.0));
        
        Hallgato.joAtlag = 3.5;
        
         System.out.println(atlagEletkor(hs));
    
        Szemely[] st = new Szemely[4];
        for (int i = 0; i < 4; i++) {
            sor = sc.nextLine();
            s = sor.split(" ");
            if (i<2) {
                st[i] = new Hallgato(s[0], Integer.parseInt(s[1]), Boolean.parseBoolean(s[2]), Double.parseDouble(s[3]));                
            }else if (i>=2) {
                st[i] = new Oktato(s[0], Integer.parseInt(s[1]), Boolean.parseBoolean(s[2]), s[3]);               
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println(st[i]);
        }
    
        
     
     Egyetem e = new Egyetem();

        Egyetem.hAndo.add(new Hallgato("A", 22, true, 3.5));
        Egyetem.hAndo.add(new Oktato("B", 35, true, "IK"));
        Egyetem.hAndo.remove(1);
        Egyetem.hAndo.add(new Oktato("C", 45, true, "BTK"));
        Egyetem.hAndo.add(new Hallgato("D", 24, true, 4.5));
        Egyetem.hAndo.add(new Oktato("EA", 32, false, "IK"));
        
        System.out.println("--------------------------------");
        Egyetem.fiatal(Egyetem.hAndo);
        Egyetem.noIk(Egyetem.hAndo);
        System.out.println("--------------------------------");
        for (int i = 0; i < Egyetem.hAndo.size(); i++) {
            System.out.println(Egyetem.hAndo.get(i).toString());
        }
        
        
        
    
        

       
    
    
    
    
    
    }

    
}
