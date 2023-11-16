package user_defined_logic;

public class Q15 {

    public static void main(String[] args) {
        // declare a variable to specify the total number of times even number is required to display
        int Total = 20;

        System.out.println("Even numbers up to " + Total + ":");
        for (int i = 1; i <= Total; i++) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

