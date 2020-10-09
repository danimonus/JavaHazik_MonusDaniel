package F8;

/**
 * Teszt osztály.
 * @author monus
 */



public class Teszt {
/**
 * Két katona objektumot hasonlit össze a tamadóerő és a védőerő alapján majd visszatérési értéke 
 * a győztes katona objektuma.
 * @param k1
 * @param k2
 * @return 
 */
public static Katona megkuzd(Katona k1, Katona k2){

    int nyert = 0;
    
    if (k1.getTamadoEro() >= k2.getVedoEro()) {
        nyert = 1;
    }
    else if (k1.getVedoEro() < k2.getTamadoEro()) {
        nyert = 2;
    }
    
    System.out.println("Az első katona: " + k1 + " a második katona: " + k2);    
 
    if (nyert == 1) {
        return k1;
    }
    else
        return k2;
    
    
    
}
    
    
    public static void main(String[] args) {
        
        Katona k1 = new Nyilas(20, 10, 5);
        Katona k2 = new Nyilas(15, 14, 8);
        Katona k3 = new Landzsas(17, 15, 4);
        
        System.out.println("Életben mardat: " + megkuzd((megkuzd(k1, k2)), k3));

        
        
    }
    
}
