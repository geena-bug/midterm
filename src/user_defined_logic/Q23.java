package user_defined_logic;

import java.util.Scanner;

public class Q23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        displayPattern(n);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

