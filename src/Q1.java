import java.util.Scanner;

/**
 * Java program to take 5 integers and find the smallest integer
 */
public class Q1 {
    public static void main(String[] args) {
        //Declaration section
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[5];

        System.out.println("Enter 5 integers:");

        //Processing Section
        // Reading integers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            integers[i] = scanner.nextInt();
        }

        // Finding the smallest integer
        int smallest = integers[0];
        for (int i = 1; i < 5; i++) {
            if (integers[i] < smallest) {
                smallest = integers[i];
            }
        }

        // Output Section
        System.out.println("The smallest integer entered is: " + smallest);

    }
}
