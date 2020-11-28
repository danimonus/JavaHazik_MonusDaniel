package Osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class osztaly implements Comparable<osztaly>{

 private String nev;
 int penz;

    public osztaly(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public String getNev() {
        return nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }
    
    

    @Override
    public String toString() {
        return nev + ";" + penz;
    }

    @Override
    public int compareTo(osztaly o) {
        
        int diff = Integer.compare(o.getPenz(),this.penz);
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
        
         List<osztaly> list = new ArrayList<>();
         
         while (sc.hasNextLine()) {
             sor = sc.nextLine();
             
             if (sor.isEmpty()) {                 
                 break;
             } else {

                String [] s = sor.split(";");
                 
                 boolean nevEgyezik = false;
                 
                 for (int i = 0; i < list.size(); i++) {                                          
                     if (list.get(i).getNev().equals(s[0])) {                         
                         int p = Integer.parseInt(s[1]);
                         list.get(i).penz += p;
                         nevEgyezik = true;
                     }  
                 }
                     
                     if(nevEgyezik == false){

                         list.add(new osztaly(s[0], Integer.parseInt(s[1])));
                     }
                 

             }
         }

         Collections.sort(list);
         for (osztaly j : list) {
             System.out.println(j.toString());
         }
        
         
         
     }
     
     

}