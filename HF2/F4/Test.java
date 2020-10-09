package F4;

/**
 * Teszt osztály.
 */

import java.util.Arrays;

public class Test {
    
    public static void rendezMaxSzallitoTeherCsokkenoleg(teherAuto[] teher){
    
        for (int i = 0; i < teher.length-1; i++) {
            for (int j = i+1; j < teher.length; j++) {
                if (teher[i].getMaxSzallithatoTeher() < teher[j].getMaxSzallithatoTeher()) {
                    teherAuto tmp = teher[j];
                    teher[j] = teher[i];
                    teher[i] = tmp;
                }
            }
        }
    }
    
    public static int keresMaxMotorTeljesitmeny(Auto[] auto){
     int max = Integer.MIN_VALUE;
     
        for (int i = 0; i < auto.length; i++) { 
            if (auto[i].getMotorTeljesitmeny() > max) {
               max = auto[i].getMotorTeljesitmeny();
            }
        }
        return max;
    }
    

    public static void main(String[] args) {
        
        Auto[] autoArray = new Auto[10];
        
        autoArray[0] = new Auto("abc123", 20);
        autoArray[1] = new Auto("bcd234", 25);
        autoArray[2] = new Auto("cdf234", 30);
        autoArray[3] = new Auto("dfg745", 50);
        autoArray[4] = new Auto("fkd476", 70);
        autoArray[5] = new teherAuto("fjg483", 100, 20);
        autoArray[6] = new teherAuto("sdf487", 110, 25);
        autoArray[7] = new teherAuto("cbv294", 90, 10);
        autoArray[8] = new teherAuto("axg888", 80, 15);
        autoArray[9] = new teherAuto("lkr734", 130, 40);
        
        
        teherAuto[] teherArray = new teherAuto[10];
        teherArray[0] = new teherAuto("ASD234", 10, 9);
        teherArray[1] = new teherAuto("ASD234", 1, 10);
        teherArray[2] = new teherAuto("ASD234", 9, 7);
        teherArray[3] = new teherAuto("ASD234", 2, 12);
        teherArray[4] = new teherAuto("ASD234", 5, 6);
        teherArray[5] = new teherAuto("ASD234", 4, 3);
        teherArray[6] = new teherAuto("ASD234", 7, 7);
        teherArray[7] = new teherAuto("ASD234", 8, 10);
        teherArray[8] = new teherAuto("ASD234", 11, 5);
        teherArray[9] = new teherAuto("ASD234", 12, 8);
        
        
        System.out.println("Max teljesitmeny: " + keresMaxMotorTeljesitmeny(autoArray));
        
        System.out.println("Rendezés után szállítható teher csökkenőleg:");
       rendezMaxSzallitoTeherCsokkenoleg(teherArray);
        for (int i = 0; i < teherArray.length; i++) {
            System.out.println(teherArray[i].getMaxSzallithatoTeher());
        }
           
        
    }


    
}
