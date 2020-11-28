package F2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author monus
 */
public class Teszt {

    
  public static List<Hatizsak> kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(List<Hatizsak> lista){
  
      Collections.sort(lista);
        
        for (Hatizsak j : lista) {
            System.out.println(j.toString());
        }  
      return lista;
  }     
    
    
    public static void main(String[] args) {
        
        List<Hatizsak> ht = new ArrayList<>();
        
        ht.add(new Hatizsak("Adidas", 10, 5, true));
        ht.add(new Hatizsak("Puma", 3, 6, true));
        ht.add(new Hatizsak("Nike", 2, 4, true));
        ht.add(new Hatizsak("SuperDry", 15, 7, true));
        ht.add(new Hatizsak("Converse", 4, 3, true));
        ht.add(new Hatizsak("Adidas", 8, 5, true));
        ht.add(new Hatizsak("Samsonite", 12, 6, true));
        ht.add(new Hatizsak("MK", 4, 2, false));
        ht.add(new Hatizsak("CK", 1, 2, true));
        ht.add(new Hatizsak("LV", 3, 6, true));
        
        
        kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(ht);
        
    }

    
}
