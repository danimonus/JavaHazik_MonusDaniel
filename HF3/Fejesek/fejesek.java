//package Fejesek1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class fejesek implements Comparable<fejesek>{

private String nev;
private int osszgol;
private int szabadrugas;
private int bunteto;
private int akciogol;
private double fejes;

    public fejesek(String nev, int osszgol, int szabadrugas, int bunteto, int akciogol, double fejes){
        this.nev = nev;
        this.osszgol = osszgol;
        this.szabadrugas = szabadrugas;
        this.bunteto = bunteto;
        this.akciogol = akciogol;
        this.fejes = fejes;
    }

    public String getNev() {
        return nev;
    }

    public int getOsszgol() {
        return osszgol;
    }

    public int getSzabadrugas() {
        return szabadrugas;
    }

    public int getBunteto() {
        return bunteto;
    }

    public int getAkciogol() {
        return akciogol;
    }

    public double getFejes() {
        return fejes;
    }

    public void setAkciogol(int akciogol) {
        this.akciogol = akciogol;
    }

    public void setFejes(int fejes) {
        this.fejes = fejes;
    }

   
    
    


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String [] s = null;
        int n = 0;
            int osszg = 0;
            int szabad = 0;
            int bunteto = 0;
            int akcio = 0;
            int fejes = (int)(akcio*0.2 + szabad * 0.4);
        sor = sc.nextLine();
        n = Integer.parseInt(sor);
        fejesek [] f = new fejesek[n];
        
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(";");
             osszg = Integer.parseInt(s[1]);
             szabad = Integer.parseInt(s[2]);
             bunteto = Integer.parseInt(s[3]);
             akcio = osszg - (szabad+bunteto);
             fejes = (int)(akcio*0.2 + szabad * 0.4);
            f[i] = new fejesek(s[0], osszg, szabad, bunteto, akcio, fejes);
        }
        
        Arrays.sort(f);
        //rendez(f);
        for (int i = 0; i < n; i++) {
            System.out.println(f[i].getNev() + ": " + (int)f[i].getFejes());
        }
    }
    
    
//    public static void rendez(fejesek [] f){
//    
//        for (int i = 0; i < f.length; i++) {
//            for (int j = i+1; j < f.length; j++) {
//                if (f[i].getFejes() == f[j].getFejes()) {
//                    if (f[i].getOsszgol() == f[j].getOsszgol()) {
//                        if (f[i].getBunteto() == f[j].getBunteto()) {
//                            if (f[i].getNev().compareTo(f[j].getNev())>0) {
//                                 fejesek tmp = f[i];
//                                 f[i] = f[j];
//                                 f[j] = tmp;
//                            }
//                        }else if (f[i].getBunteto() > f[j].getBunteto()) {
//                            fejesek tmp = f[i];
//                                 f[i] = f[j];
//                                 f[j] = tmp;
//                        }
//                    }else if (f[i].getOsszgol() < f[j].getOsszgol()) {
//                        fejesek tmp = f[i];
//                                 f[i] = f[j];
//                                 f[j] = tmp;
//                    }
//                }else if (f[i].getFejes() < f[j].getFejes()) {
//                    fejesek tmp = f[i];
//                                 f[i] = f[j];
//                                 f[j] = tmp;
//                }
//            }
//        }
//    
//    }
//    
    
    

        @Override
    public int compareTo(fejesek o) {

        if (this.fejes == o.getFejes()) {
            if (this.osszgol == o.getOsszgol()) {
                if (this.bunteto == o.getBunteto()) {
                    return this.nev.compareTo(o.getNev());
                } return this.bunteto - o.getBunteto();
            } return o.getOsszgol() - this.getOsszgol();
        }return Double.compare(o.getFejes(), this.fejes);
    }
    
}
