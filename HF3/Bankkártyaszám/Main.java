package Bankkártyaszám;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = null;
        int szam = 0;  
        int osszeg = 0;

        while (sc.hasNextLine()) {
             osszeg = 0;
             sor = sc.nextLine();
            if (sor.isEmpty()) {
                break;
            } else {
                for (int i = sor.length() - 1; i >= 0; i--) {

                    szam = Character.getNumericValue(sor.charAt(i));

                    if (i % 2 == 0) {
                        szam *= 2;
                    }

                    if (szam >= 10) {
                        szam -= 9;
                    }

                    osszeg += szam;

                }
                    if (osszeg%10 == 0) {
                        System.out.println("YES");
                }else
                        System.out.println("NO");

            }

        }
    }
}
