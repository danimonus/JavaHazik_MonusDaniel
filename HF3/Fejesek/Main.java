package Fejesek;

import java.util.Scanner;

/**
 *
 * @author monus
 */
public class Main {
    
    public static int fejesekSzama(int a, int sz){
    int fejes = 0;
    fejes = (int) (a * 0.2);
    a = fejes;
    fejes = (int) (sz * 0.4);
    fejes += a;
    return fejes;            
    }
    
    private static void rendezes(Csapat[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if ((fejesekSzama(a[i].getAkcio(), a[i].getSzabadrugas())) == (fejesekSzama(a[j].getAkcio(), a[j].getSzabadrugas()))) {
                    if (a[i].getOsszgol() == a[j].getOsszgol()) {
                        if (a[i].getBunteto() == a[j].getBunteto()) {
                            if ((a[i].getCsapatNev().compareTo(a[j].getCsapatNev()))>0) {
                                Csapat tmp = a[i];
                                a[i] = a[j];
                                a[j] = tmp;
                            }
                        }else if (a[i].getBunteto() < a[j].getBunteto()) {
                            Csapat tmp = a[i];
                                a[i] = a[j];
                                a[j] = tmp;
                            }
                        }else if (a[i].getOsszgol() < a[j].getOsszgol()) {
                            Csapat tmp = a[i];
                                a[i] = a[j];
                                a[j] = tmp;
                    }
                }else if ((fejesekSzama(a[i].getAkcio(), a[i].getSzabadrugas())) < (fejesekSzama(a[j].getAkcio(), a[j].getSzabadrugas()))) {
                            Csapat tmp = a[i];
                                a[i] = a[j];
                                a[j] = tmp;
                    
                }
            }
  
        }
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String s[] = null;
        int n = 0;
        int akcioG = 0;
        n = Integer.parseInt(sc.nextLine());
        Csapat [] cs = new Csapat[n];
        
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(";");
            akcioG = Integer.parseInt(s[1])-(Integer.parseInt(s[2])+Integer.parseInt(s[3]));
            cs[i] = new Csapat(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]), akcioG);
        }
        
        rendezes(cs);
        
        for (int i = 0; i < n; i++) {
           
            System.out.println(cs[i].getCsapatNev() + ": "+ fejesekSzama(cs[i].getAkcio(),cs[i].getSzabadrugas()));
        }
        
        
    }

   


    
}
