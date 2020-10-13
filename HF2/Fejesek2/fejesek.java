package Fejesek2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Egy tornasort modellez. A gyerek nevét és az előtte lévő gyerek nevét. 
 * @author monus
 */


public class fejesek {

    private String nev;
    private String elotte;

    public fejesek(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }

    public String getNev() {
        return nev;
    }

    public String getElotte() {
        return elotte;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = null;
        String s[] = null;
        sor = sc.nextLine();
        s = sor.split(";");
        int n = Integer.parseInt(s[0]);
        String nev = s[1];
        String elotte = s[2];

        fejesek[] t = new fejesek[n];

        for (int i = 0; i < n - 1; i++) {
            sor = sc.nextLine();
            s = sor.split(";");

            t[i] = new fejesek(s[0], s[1]);
        }

        int piros = 0;
        int kek = 0;
        String[] lista = new String[n];
        lista[0] = nev;
        int k = 1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (lista[i].equals(t[j].getElotte())) {
                    lista[k] = t[j].getNev();
                    k++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (lista[i].equals(elotte)) {
                System.out.println(piros + " " + kek);                
            }

            if (i % 2 == 0) {
                piros++;
            } else {
                kek++;
            }

        }

    }

}
