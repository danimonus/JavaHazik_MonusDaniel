package F3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Main {

    
    public static List<teherAuto> nagyobb20(Auto[] a) {

        List<teherAuto> tal = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof teherAuto) {
                teherAuto ta = (teherAuto) a[i];
                if (ta.getTeherbiras() > 20000) {
                    tal.add(ta);
                }

            }
        }

        return tal;
    }

    public static void max3(List<Auto> la) {
        int db = 0;
        Collections.sort(la);

        if (la.size() > 2) {

            for (int i = 0; i < 3; i++) {
                System.out.println(la.get(i).toString());
            }

        } else {
            for (Auto j : la) {
                System.out.println(j.toString());
            }
        }

    }
    
    public static void main(String[] args) {
        

        Auto[] a = new Auto[4];
        List<Auto> aul = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String sor = null;                
        String [] s = null;
        sor = sc.nextLine();
        
        Auto a1 = new Auto(sor, 1000, true);
        a1.getExtrak().add("ABS");
        a1.getExtrak().add("Led világitás");
        a1.getExtrak().remove(1);
        
        System.out.println("extra = " + a1.getExtrak());
        
        System.out.println(a1.toString());
        
        for (int i = 0; i < 4; i++) {
            sor = sc.nextLine();
            s = sor.split(" ");
            
            if (i<2) {
                a[i] = new Auto(s[0], Integer.parseInt(s[1]), true);
            }else if (i>=2) {
                a[i] = new teherAuto(s[0], Integer.parseInt(s[1]), true, Integer.parseInt(s[3]));
            }
            
        }
        
        System.out.println(a1.rendszame(a1.getRendszám()));       
        
        for (teherAuto j : nagyobb20(a)) {
            System.out.println(j.toString());
        }
     
        
        aul.add(new Auto("ABC123", 1200, true));
        aul.add(new Auto("BCC234", 1000, true));
        aul.add(new Auto("AAA222", 1500, true));
        aul.add(new Auto("BBB444", 1700, true));
        
        max3(aul);
        
        System.out.println(Auto.objSzam);
        
    }

    
}
