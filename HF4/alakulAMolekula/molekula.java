package alakulAMolekula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class molekula {

    private String vegyjel;
    private String elemnev;

    public molekula(String vegyjel, String elemnev) {
        this.vegyjel = vegyjel;
        this.elemnev = elemnev;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public String getElemnev() {
        return elemnev;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof molekula)) {
            return false;
        }
        
        molekula m = (molekula) obj;
        
        return this.elemnev.equals(m.getElemnev());
    }

    @Override
    public String toString() {
        return vegyjel + " " + elemnev;
    }
    
    
    
    
}



class molekulaNev{

private String nev;
private List<String> molekulak;
int db;

    public molekulaNev(String nev) {
        this.nev = nev;
        this.molekulak = new ArrayList<>();
        this.db = db;
    }

    public String getNev() {
        return nev;
    }

    public List<String> getMolekulak() {
        return molekulak;
    }

    public int getDb() {
        return db;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof molekulaNev)) {
            return false;
        }

        molekulaNev mn = (molekulaNev) obj;
        
        return this.nev.equals(mn.getNev());
    }

    @Override
    public String toString() {
        return nev + ", " + molekulak;
    }
}


class osszesit{

private String vegyuletNev;
int molekulaDb;
private int molekulaNev;

    public osszesit(String vegyuletNev, int molekulaDb, int molekulaNev) {
        this.vegyuletNev = vegyuletNev;
        this.molekulaDb = molekulaDb;
        this.molekulaNev = molekulaNev;
    }

    public String getVegyuletNev() {
        return vegyuletNev;
    }

    public int getMolekulaDb() {
        return molekulaDb;
    }

    public int getMolekulaNev() {
        return molekulaNev;
    }

   }





class main{
    
    public static void main(String[] args) {
        
    
Scanner sc = new Scanner(System.in);
String sor = null;
String [] s = null;
List<molekula> mlist = new ArrayList<>();
List<molekulaNev> mnlist = new ArrayList<>();
List<osszesit> olist = new ArrayList<>();
//List<osszesit> olist = new ArrayList<>();




 while(!(sor = sc.nextLine()).equals("-")){
    s = sor.split(":");
    
    molekula m = new molekula(s[0], s[1]);
    
    mlist.add(m);
   
}
 
        System.out.println("------");
        for (molekula j : mlist) {
            System.out.println(j.toString());
        }
 
 
       
        
        while(!(sor = sc.nextLine()).equals("vege")){
        
             s = sor.split("[:,]");
             
             molekulaNev mn = new molekulaNev(s[0]);
             System.out.println("s0 = " + s[0]);
           
            for (int i = 1; i < s.length; i++) {
                mn.getMolekulak().add(s[i]);
            }
            
            mnlist.add(mn);

          
             for (int j = 0; j < mlist.size(); j++) {
            
                 for (int i = 0; i < mn.getMolekulak().size(); i++) {
                     
                    if (mlist.get(j).getVegyjel().equals(mn.getMolekulak().get(i))) {
                        System.out.println("vegyjel= " + mlist.get(j).getVegyjel());
                        System.out.println("molekula = " +mn.getMolekulak().get(i));
                            mn.db ++;
                            
                       // mnlist.get(j).db += 1;
                       // System.out.println(mnlist.get(i).db);
                        

                        
                    }
                    
                     System.out.println("mndb = " + mn.db);
                }


            }
            
            
            
            
            
            
        }
        
        for (molekulaNev j : mnlist) {
            System.out.println(j.toString());
        }
        
        
        
    }






}