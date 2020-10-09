package Fejesek2;

/**
 * Fejesek tesztosztlya.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Main {

   /*5;Peter;Barnabas
Gabor;Jozsef
Samu;Barnabas
Jozsef;Peter
Barnabas;Gabo
*/
    public static void main(String[] args) {
        
    
    ArrayList<Fejesek> lista = new ArrayList<Fejesek>();
    Scanner sc = new Scanner(System.in);
    String sor = sc.nextLine();
    String [] parts = sor.split(";");
    int n = Integer.parseInt(parts[0]);
    String elso = parts[1];
    String nez = parts[2];
    String [] tornasor = new String[n];
    tornasor[0] = elso;
    
        for (int i = 0; i < n-1; i++) {
            sor = sc.nextLine();
            parts = sor.split(";");
            tornasor[i] = parts[0];
            lista.add(new Fejesek(parts[0],parts[1]));            
        }


        for (int i = 1; i < tornasor.length; i++) {
            for (int j = 1; j < lista.size(); j++) {
                if (tornasor[i-1].equals(lista.get(j).getElotte())) {                    
                    tornasor[i] = lista.get(j).getNev();
                    break;
                }
            }
        }
    
        int piros = 0, kek = 0, flag = 0;

        while (!(tornasor[flag].equals(nez))) {
            if (flag % 2 == 0) {
                piros++;
            } else {
                kek++;
            }
            flag++;
        }
        System.out.println(piros + " " + kek);

    }  
}
