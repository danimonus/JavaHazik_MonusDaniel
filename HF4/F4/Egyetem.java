package F4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author monus
 */
public class Egyetem{
    
    public static void fiatal(List<Szemely> s){
        int db = 0;
        Szemely[] sz = new Szemely[s.size()];
        //Hallgato[] h = new Hallgato[s.size()];
        Hallgato[] hv = new Hallgato[3];
        Collections.sort(s);
        s.toArray(sz);
        
        
        for (int i = 0; i < s.size(); i++) {
            if (sz[i] instanceof Hallgato) {
                Hallgato ha = (Hallgato) sz[i];
                hv[db] = ha;
                db++;
            }            
        }
        
        if (db < 3) {
            for (int i = 0; i < db; i++) {
                System.out.println(hv[i].toString());
            }
            
        }else if (db >= 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println(hv[i].toString());
            }
        }
        
    }

    public static void noIk(List<Szemely> no) {
        Szemely[] sz = new Szemely[no.size()];
        no.toArray(sz);       
        for (int i = 0; i < no.size(); i++) {
            if (sz[i] instanceof Oktato) {                    
                Oktato o = (Oktato) sz[i];
                if ((o.getTanszek().equals("IK")) && !(o.isFérfi())) {                    
                     no.get(i).név.concat("!");    
                     System.out.println(no.get(i).név.concat("!"));
                }
            }
        }

    }


public static  List<Szemely> hAndo;

    public Egyetem() {
    this.hAndo = new ArrayList<Szemely>();
    }
  
    

  
    
    

    




    
}
