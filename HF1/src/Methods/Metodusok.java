package Methods;

import java.util.Arrays;

public class Metodusok {

    /**
     * Szamokat tömbbe rakja majd növekvő sorrendben visszaadja.
     * @param a
     * @param b
     * @param c 
     */
    
public static void novekvo(int a, int b, int c){
int[] array = {a,b,c};
Arrays.sort(array);
    System.out.println(Arrays.toString(array));
}

/**
 * Szamokat tömbbe rakja majd visszaadja a legkisebb értékü számot, illetve az  
 * abszolutertekek közül a legnagyobb értékü számot.
 * @param a
 * @param b
 * @param c 
 */
public static void minabmax(double a, double b, double c){
double[] array = {a,b,c};
double min = Double.MAX_VALUE;
double max = Double.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }

    for (int i = 0; i < array.length; i++) {
        if (Math.abs(array[i]) > max ) {
            max = Math.abs(array[i]);
        }
    }
    System.out.println("Min=" + min + " Max=" + max);
}
/**
 * Négy értéket ír a kijelzőre attól függően, hogy a d értéke 0-tól nagyobb egyenlő, vagy kisebb.
 * @param a
 * @param b
 * @param c
 * @param d 
 */
public static void sorrend(double a, double b, double c, double d){
    if (d >= 0) {
        System.out.println(a + " " + c + " " + b + " " +d);
    }
    else
                System.out.println(a + " " + b + " " + d + " " +c);

}

/**
 * A három kapott értékből eldönti, hogy szerkeztehető háromszög.
 * @param a
 * @param b
 * @param c
 * @return - true-t add vissza ha szerkezthető háromszög, false-t ha nem.
 */
public static boolean haromszoge(int a, int b, int c){
    if (a<=0 || b<=0 || c<=0) {
        return false;
    }
    
    if ((a+b)>c && (a+c)>b && (b+c)>a) {
        return true;
    }
    else
        return false;
}

/**
 * A két megadott évszám között kiszámolja, hogy melyik szökőév, és azokat az értékeket
 * kiírja a képernyőre.
 * @param a
 * @param b 
 */
public static void szokoev(int a, int b){
    int db=0;
    for (int i = a; i <= b; i++) {
        if ((i%4 == 0 && i%100 != 0) || i%400 == 0) {
            db++;
        }
    }
    System.out.println(db);
}

/**
 * A megadott értékről eldönti, hogy megyegezik-e valamelyik osztályzattal és ha igen akkor
 * kiírja szövegesen az értékelést, ha nincs ilyen osztályzat akkor visszaadja, hogy nincs ilyen jegy.
 * @param a 
 */
public static void erdemjegy(int a){

    switch(a){
        case 1 : System.out.println("Elégtelen"); break;
        case 2 : System.out.println("Elégséges"); break;
        case 3 : System.out.println("Közepes"); break;
        case 4 : System.out.println("Jó"); break;
        case 5 : System.out.println("Kiváló"); break;
        default : System.out.println("Nincs ilyen jegy!");
    }   
}

/**
 * Kiszámolja a megadott érték hányadosát kivonásos módszerrel. Amíg az a értéke nagyobb mint a b értéke
 * addig kivonja belőle a b-t és a hányados értékét növeli 1-el.
 * @param a
 * @param b 
 */
 public static void osztas(int a, int b){
 int hanyados=0;
 
     do {
         hanyados += 1;
         a -= b;
     } while (a>=b);
     
     System.out.println(hanyados);
 
 }

 /**
  * Eldönti a számról, hogy primszám-e, majd kiírja megformázottan a képernyőre.
  * @param a 
  */
    public static void prim(int a){
    boolean f = false;
        for (int i = 2; i < a/2; i++) {
            if(a % i == 0){
                f=true;
                break;
            }
        }
        
        if (!f) {
            System.out.println("A(z) "+a+" az prímszám!");
        }
    else
            System.out.println("A(z) "+a+" az nem prímszám!");
    }
    
    /**
     * Kiírja a képernyőre a fibonacci sorozat első n elemét.
     * @param n 
     */
    public static void fibo(int n){
    int a = 0;
    int b = 1;
    int c;
    
        System.out.print(a + " " + b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println("");
    }
    
    /**
     * Visszaadja a megadott számjegy sorozat forditott változatát. 
     * @param n
     * @param ujszam 
     */
    
    public static void ujszam(int n, int ujszam){
    //ujszam = 0;
        do {
            ujszam = ujszam * 10 + n%10;
            n /= 10;
        } while (n != 0);
        
        System.out.println(ujszam);
    }
    
    /**
     * Visszaadja egy 0-12 közötti szám faktoriálisát.
     * @param n 
     */
    public static void faktorialis(int n){
    long a = 1;
        for (int i = 0; i < n; i++) {
            a *= n;
        }
        System.out.println(a);
        
    }
    
    /**
     * Két szám között visszaadja azokat a számokat amelyek oszthatók k-val.
     * @param k
     * @param n1
     * @param n2 
     */
    public static void oszthato(int k,int n1, int n2){
    
        for (int i = n1; i <= n2; i++) {
            if (i % k == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    /**
     * Visszaadja az n-től nagyobb fibonacci sorozat tagját.
     * @param n
     * @return - fibonacci sorozat n+1.-ik tagja
     */
    
     public static int fibon(int n){
    int a = 0;
    int b = 1;
    int eredmeny = 1;
    
        for (int i = 1; i < n+50; i++) {
            eredmeny = a + b;
            if(eredmeny > n){
                
                break;
            }
        a = b;
        b = eredmeny;
        }
        return eredmeny;
     }
     
     /**
      * Visszaadja az 1000-nél kisebb számokat, amelyek
    egyenlők számjegyeik köbének összegével.
      */
     
         public static void kisszamok(){
    
        for (int i = 0; i < 1000; i++) {
            int szam = i;
            int szazasok = szam/100;
            szam -= szazasok * 100;
            int tizesek = szam/10;
            szam -= tizesek * 10;
            int egyesek = szam;
            
            if((Math.pow(egyesek, 3) + Math.pow(tizesek, 3) + Math.pow(szazasok, 3))== i)
                System.out.print(i + " ");
        }
             System.out.println("");
         }
    
    public static void main(String[] args) {
        novekvo(3,17,10);
        minabmax(-13,-5,22);
        sorrend(1,2,3,-4);
        System.out.println(haromszoge(2,5,6));
        szokoev(2020,2040);
        erdemjegy(6);
        osztas(8,4);
        prim(9);
        fibo(12);
        ujszam(321,0);
        faktorialis(4);
        oszthato(4,4,24);
        System.out.println( fibon(34));
        kisszamok();
        
        
        
        
        
        
    }
    
}
