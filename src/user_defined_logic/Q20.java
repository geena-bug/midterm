package user_defined_logic;


    public class Q20 {

        public static void main(String[] args) {
            int n = 5; // Change the value of n as needed
            displayPattern(n);
        }

        public static void displayPattern(int n) {
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = n - i; j >= 1; j--) {
                    System.out.print("  ");
                }

                // Print numbers in decreasing order
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                System.out.println(); // Move to the next line
            }
        }
    }


