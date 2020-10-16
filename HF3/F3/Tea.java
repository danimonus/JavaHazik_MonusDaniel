package F3;

public class Tea implements Rendezheto<Tea>{
public String nev;
public int ar;
public Tea(String s,int j) {
nev=s;
ar=j;
}

    @Override
    public boolean egyenlo(Object o) {
        Tea t = (Tea) o;
        return this.ar==t.ar;
    }

    @Override
    public boolean nagyobbMint(Object o) {
        Tea t = (Tea) o;
        return this.ar>t.ar;
    }

    @Override
    public boolean kisebbMint(Object o) {
        Tea t = (Tea) o;
        return this.ar<t.ar;
    }

    @Override
    public int compareTo(Tea o) {
        Tea t = (Tea) o;
        
        if (this.ar > t.ar) {
            return 1;
        }else if (this.ar==t.ar) {
            return 0;
        }else
            return -1;
    
    }
   

    public static void main(String[] args) {
        
        Tea t1 = new Tea("Twinings", 320);
        Tea t2 = new Tea("Lord", 200);
        
        System.out.println(t1.nagyobbMint(t2));
        System.out.println(t1.kisebbMint(t2));
        System.out.println(t1.egyenlo(t2));
        System.out.println(t1.compareTo(t2));
        
    }

}