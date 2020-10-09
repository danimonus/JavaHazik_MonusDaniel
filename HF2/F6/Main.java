package F6;

/**
 * A main megkap egy tömböt amiről eldönti, hogy tartalmaz e négy egyfomra számot.
 * Illetve ellenőrzi, hogy tartalmaz e négy számot összesen.
 * @author monus
 */

public class Main {

    
    /**
     * Egy tömböt kap meg bemeneti paraméterként, majd eldönti, hogy tartalmaz e négy számot.
     * Ha nem akkor falsal kilép a metódsuból.
     * Ha tartalmaz minimum négy számot és azok között van négy egyforma egymás után akkor true-val tér vissza.
     * @param values
     * @return 
     */

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        }
        int db = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == 4) {
                db++;
            }
        }
        if (db >= 4) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public static void main(String[] args) {
    
        int[] numbers = {4,2,5,4,6,3,4,4};
        
        
        System.out.println(isConsecutiveFour(numbers));
        
    }

    
}
