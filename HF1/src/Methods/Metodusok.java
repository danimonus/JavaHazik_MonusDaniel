package Methods;

import java.util.Arrays;

public class Metodusok {

public static void novekvo(int a, int b, int c){
int[] array = {a,b,c};
Arrays.sort(array);
    System.out.println(Arrays.toString(array));
}

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

public static void sorrend(double a, double b, double c, double d){
    if (d >= 0) {
        System.out.println(a + " " + c + " " + b + " " +d);
    }
    else
                System.out.println(a + " " + b + " " + d + " " +c);

}

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

public static void szokoev(int a, int b){
    int db=0;
    for (int i = a; i <= b; i++) {
        if ((i%4 == 0 && i%100 != 0) || i%400 == 0) {
            db++;
        }
    }
    System.out.println(db);
}

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

 public static void osztas(int a, int b){
 int hanyados=0;
 
     do {
         hanyados += 1;
         a -= b;
     } while (a>=b);
     
     System.out.println(hanyados);
 
 }

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
    
    public static void ujszam(int n, int ujszam){
    //ujszam = 0;
        do {
            ujszam = ujszam * 10 + n%10;
            n /= 10;
        } while (n != 0);
        
        System.out.println(ujszam);
    }
    
    public static void faktorialis(int n){
    long a = 1;
        for (int i = 0; i < n; i++) {
            a *= n;
        }
        System.out.println(a);
        
    }
    
    public static void oszthato(int k,int n1, int n2){
    
        for (int i = n1; i <= n2; i++) {
            if (i % k == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

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
