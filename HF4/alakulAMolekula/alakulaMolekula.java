package alakulAMolekula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author monus
 */

class elemek implements Comparable<elemek>{

    public String elemNev;
    public List<darab> elemekLista;

    public elemek(String elemNev) {
        this.elemNev = elemNev;       
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(this.elemNev).append(": ").append(System.getProperty("line.separator"));
        
        for (int i = 0; i < elemekLista.size(); i++) {
            sb.append(elemekLista.get(i)).append(System.getProperty("line.separator"));
        }
        
        return sb.toString();
        
        
    }

    @Override
    public int compareTo(elemek t) {

        return this.elemNev.compareTo(t.elemNev);
        
    }

}

class darab implements Comparable<darab>{

public String nev;
public int tomeg;

    public darab(String nev, int tomeg) {
        this.nev = nev;
        this.tomeg = tomeg;
    }

    @Override
    public String toString() {
        return tomeg + " " + nev;
    }

    @Override
    public int compareTo(darab t) {
        int diff = Integer.compare(t.tomeg, this.tomeg);
        if (diff != 0) {
            return diff;
        }
        return this.nev.compareTo(t.nev);
    }




}


public class alakulaMolekula {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String [] s = null;
        List<elemek> mainList = new ArrayList<elemek>();
        Map<String, String> tabla = new TreeMap<String,String>();
        int index = 0;
        
        while(!(sor = sc.nextLine()).equals("-")){
        
            s = sor.split(":");
        
            if (tabla.containsKey(s[0])) {
            }else{
             //contain keys = s[0] = H O Na Cl
            tabla.put(s[0], s[1]);
            }
        }
        
        while(!(sor = sc.nextLine()).equals("vege")){
        List<darab> mellek = new ArrayList<darab>();
        
        s = sor.split("[:,]");
        String nev = s[0];
        
            for (int i = 1; i < s.length; i++) {
                int talalt = 0;
                for (int j = 0; j < mellek.size(); j++) {
                    
                    if (mellek.get(j).nev.equals(tabla.get(s[i]))) {
                        //mellek = hidrogen, tabla = hidrogen, getj = 1                        
                        mellek.get(j).tomeg++;
                        talalt++;
                        break;
                    }
                }
            
        
            if (talalt == 0) {
                mellek.add(new darab(tabla.get(s[i]),1));                
                //s[i] = hidrogen oxigen natruim klor
            }
        }
            Collections.sort(mellek);
            
            mainList.add(new elemek(nev));
            
            
            mainList.get(index).elemekLista = new ArrayList<darab>();
            
            for (int i = 0; i < mellek.size(); i++)               
            mainList.get(index).elemekLista.add(mellek.get(i));
            //2 hidrogen, 2 hidrogen 1 oxigen... folyamatosan adja hozza a fo listahoz
                mellek.clear();
                mellek.removeAll(mellek);
                index++;
            
        }
        
        Collections.sort(mainList);
        
        for (elemek j : mainList) {
            System.out.println(j.toString());
        }
        
        tabla.clear();
        mainList.clear();
        mainList.removeAll(mainList);
        System.gc();
    }


    
}
