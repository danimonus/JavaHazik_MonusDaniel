/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizGyujto;

/**
 *
 * @author monus
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Vizgyujto
{
    private String nev;
    private List<Vizgyujto> befolyo;
    public Vizgyujto(String nev)
    {
        this.nev = nev;
        this.befolyo = new ArrayList<>();
    }
    public void gyujti(Vizgyujto v) { befolyo.add(v); }
    public String getNev() { return nev; }
    public List<Vizgyujto> getBefolyo() { return befolyo; }
    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof Vizgyujto && nev.equals(((Vizgyujto)obj).nev);
    }
    private int befolyokSzama()
    {
        return befolyo.size();
    }
    @Override
    public String toString()
    {
        return nev + ": " + befolyokSzama();
    }
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        String sor = null;
        String[] s = null;
        List<Vizgyujto> vlist = new ArrayList<>();
        
        while(!(sor = sc.nextLine()).equals("vege")){
        
            s = sor.split(";");
            Vizgyujto v0;
            Vizgyujto v1;
           
                v0 = new Vizgyujto(s[0]);
                
            if (s.length == 2) {
                v1 = new Vizgyujto(s[1]);
                
                
                if (vlist.contains(v1)) {
                    int index = vlist.indexOf(v1);
                    vlist.get(index).getBefolyo().add(new Vizgyujto(s[0]));
                    
                    
                }else{
                
                    vlist.add(v1);
                    v1.getBefolyo().add(new Vizgyujto(s[0]));
                    
                    
                
            }
           }else vlist.add(new Vizgyujto(s[0]));
            
            if (!(vlist.contains(v0))) {  
                vlist.add(v0);
            }
              
        }
       
            for (int i = 0; i < args.length; i++) {
                if (vlist.get(i).getNev().equals(args[i])) {
                System.out.println(vlist.get(i).toString());        
                
                }else{
                    System.out.println(args[i] + ": 0");
                }
            }
        }

}