package F6;

public class Teszt {

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        }
        int flag = 0;

        for (int i = 0; i < values.length - 4; i++) {
            System.out.println(values[i] +" "+ values[1] +" "+ values[2]+" "+ values[3] +" "+ values[4]);
            if (values[i] == values[i + 1] && values[i] == values[i + 2]
                    && values[i] == values[i + 3]) {
                flag = 1;
            }

        }
        
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {4,4,4,4,3,2,5,2};

        System.out.println(isConsecutiveFour(numbers));

    }

}
