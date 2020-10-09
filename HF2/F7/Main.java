package F7;

/**
 * A kő-papír-ollo játékot modellezi. Egy véletlenszám generátorral állitja elő, hogy a gép 
 * milyen Stringget azza kő papír vagy ollo stringgel hasonlitja össze a saját stringünket
 * majd kiírja ki a nyertes.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        String be = "";
        String gep = null;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        
      
       while(true){
       while(!(be.equals("ko") || be.equals("papir") || be.equals("ollo") || be.equals("vege"))){           
       be = sc.nextLine();
       }
           if (be.equals("vege")) {
               break;
           }
       switch(rand.nextInt(3)){
           case 0 : gep = "ko"; break;
           case 1 : gep = "papir"; break;
           case 2 : gep = "ollo"; break;  
       }
       
           System.out.println("sajat = " + be);
           System.out.println("gep = " + gep);
           
           if (be.equals(gep)) {
               System.out.println("Döntetlen");               
           }
           
           else if (be.equals("papir") && gep.equals("ollo")) {
               System.out.println("Nem nyertel!");
           } else if (be.equals("ko") && gep.equals("papir")) {
               System.out.println("Nem nyertel!");
           } else if (be.equals("ollo") && gep.equals("papir")) {
               System.out.println("Nyertel!");
           } else if (be.equals("papir") && gep.equals("ko")) {
               System.out.println("Nyertel!");
           } else if (be.equals("ollo") && gep.equals("ko")) {
               System.out.println("Nem nyertel!");
           } else if (be.equals("ko") && gep.equals("ollo")) {
               System.out.println("Nyertel!");
           }

           
           be = sc.nextLine();
       }
        
        
    }
    
    
}
