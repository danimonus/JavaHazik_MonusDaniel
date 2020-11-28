package karacsonyiHozzavalok;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



/**
 *
 * @author monus
 */
class Teszt implements Comparable<Teszt>{
    
 String hozzavaloNeve;
 int db;

    public Teszt(String hozzavaloNeve, int db) {
        this.hozzavaloNeve = hozzavaloNeve;
        this.db = db;
    }

    public String getHozzavaloNeve() {
        return hozzavaloNeve;
    }

    public int getDb() {
        return db;
    }


    public void setDb(int db) {
        this.db = db;
    }
    
    

    @Override
    public String toString() {
        return hozzavaloNeve + ";" + db;
    }

    @Override
    public int compareTo(Teszt t) {
        
        int diff = this.hozzavaloNeve.compareTo(t.getHozzavaloNeve());
        if (diff != 0) {
            return diff;
        }else return Integer.compare(this.db, t.getDb());
   
    }
}

public class main{

     public static void main(String[] args) {
         
     List<Teszt> lista = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
    
    
        
     while(sc.hasNextLine()){
         String sor = sc.nextLine();
         
         if (sor.isEmpty()) {
             break;
         }else{
        
        String [] s = sor.split(";");
         
         boolean tartalmazza = false;
         
         for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).hozzavaloNeve.equals(s[0])) {
                 tartalmazza = true;
                 lista.get(i).db += Integer.parseInt(s[1]);                 
             }
         }
                 if (tartalmazza == false) {
                 lista.add(new Teszt(s[0], Integer.parseInt(s[1])));
             
         }
     }
     }

         for (Teszt j : lista) {
             System.out.println(j.toString());
         }
     
     
     
     
     }
     
  
     
}