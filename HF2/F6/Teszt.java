package F6;

public class Teszt {

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        }
        int flag = 0;

        for (int i = 0; i < values.length - 4; i++) {

            if (values[i] == values[i + 1] && values[i] == values[i + 2]
                    && values[i] == values[i + 3] && values[i] == values[i + 4]) {
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

        int[] numbers = {3, 3, 2, 3, 3, 6};

        System.out.println(isConsecutiveFour(numbers));

    }

}
