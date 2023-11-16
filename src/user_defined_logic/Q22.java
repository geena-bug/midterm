package user_defined_logic;

    import java.util.Scanner;

    public class Q22 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter three numbers
            System.out.print("Enter three numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            // Call the method to display the numbers in increasing order
            displaySortedNumbers(num1, num2, num3);
        }

        public static void displaySortedNumbers(double num1, double num2, double num3) {
            // Find the minimum, middle, and maximum numbers
            double min = Math.min(Math.min(num1, num2), num3);
            double max = Math.max(Math.max(num1, num2), num3);
            double middle = num1 + num2 + num3 - min - max;

            // Display the numbers in increasing order
            System.out.println("The numbers in increasing order are: " + min + " " + middle + " " + max);
        }
    }


