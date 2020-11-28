package Parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monus
 */
public class parkolo implements Comparable<parkolo>{

private String varos;
private double terulet;
private int kapacitas;
private List<String> rendszam;

    public parkolo(String varos, double terulet, int kapacitas) {
        this.varos = varos;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = new ArrayList<>();
    }

    public String getVaros() {
        return varos;
    }

    public double getTerulet() {
        return terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public List<String> getRendszam() {
        return rendszam;
    }

    
    public int szabadHely(){
     return this.kapacitas - this.getRendszam().size();
    }
    
    @Override
    public String toString() {
        return varos + ": " + szabadHely() + " szabad hely";
    }

    @Override
    public int compareTo(parkolo o) {

           int diff = Integer.compare(o.szabadHely(),this.szabadHely());
           
           if (diff != 0) {
            return diff;
        }
           return this.varos.compareTo(o.getVaros());
        
    }
    
}


class main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String [] s = null;
        List<parkolo> list = new ArrayList<>();
        
        while(sc.hasNextLine()){
        sor = sc.nextLine();
            if (sor.isEmpty()) {
                break;
            }else{
            
            
            s = sor.split(";");
            
            parkolo p = new parkolo(s[0], Double.parseDouble(s[1]), Integer.parseInt(s[2]));
                for (int i = 3; i < s.length; i++) {
                    p.getRendszam().add(s[i]);
                }
            
                 list.add(p);
            }
        
           
        }
        
        
        Collections.sort(list);
        for (parkolo j : list) {
            if (j.szabadHely() > 2) {                           
            System.out.println(j.toString());
            }
         }
        
    }




}
