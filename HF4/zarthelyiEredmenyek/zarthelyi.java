/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarthelyiEredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class zarthelyi implements Comparable<zarthelyi>{

private String nev;
int pont;

    public zarthelyi(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public int getPont() {
        return pont;
    }

    @Override
    public String toString() {
        return nev + ": " + pont + " pont";
    }

    @Override
    public int compareTo(zarthelyi o) {
        
        int diff = Integer.compare(o.getPont(), this.pont);
        
        if (diff != 0) {
            return diff;
        }
        return this.nev.compareTo(o.getNev());
    }          
    
}

class main{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String [] s = null;
        List<zarthelyi> list = new ArrayList<>();
        
        
        while(sc.hasNextLine()){
            sor = sc.nextLine();
            if (sor.isEmpty()) {
                break;
            }else{
            
                s = sor.split(";");
                
                 boolean vanMar = false;
                 
                 for (int i = 0; i < list.size(); i++) {
                     if (list.get(i).getNev().equals(s[0])) {
                         vanMar = true;
                         list.get(i).pont += Integer.parseInt(s[1]);
                     }
                }
                 if (vanMar == false) {
                    list.add(new zarthelyi(s[0], Integer.parseInt(s[1])));
                }
                
                
           
            
            }
        }
        
        Collections.sort(list);
        for (zarthelyi j : list) {
            System.out.println(j.toString());
        }
        
        
        
        
        
    }


}