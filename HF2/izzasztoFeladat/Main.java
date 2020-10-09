package izzasztoFeladat;

/**
 * Adat osztály tesztosztálya.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Main {

    public static void main(String[] args) {
        
    
Scanner sc = new Scanner(System.in);
int fok = 0;
int homerseklet = 0;
String sor = sc.nextLine();
String [] s = sor.split(" ");
int n = Integer.parseInt(s[0]);
Adat[] adat = new Adat[n];
String varosNev = s[1];
int flag = 0;


        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(":");
            adat[i] = new Adat(s[0], Integer.parseInt(s[1]));
            if (s[0].equals(varosNev)) {
                homerseklet = Integer.parseInt(s[1]);
                flag = 1;
            }
        }

        if (flag == 1) {

            Arrays.sort(adat);

            for (int i = 0; i < n; i++) {
                if (adat[i].getFok() > homerseklet) {
                    System.out.println(adat[i]);
                }

            }
        } else {
            System.out.println("Missing data");
        }


        

    } 
}
