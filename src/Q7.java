import java.util.Scanner;

/**
 * Write a program that presents the user with the following menu of items:
 * Chips		$1.35
 * Chocolate Bar		$1.65
 * Pop			$2.00
 * Energy Drink		$3.75
 * Exit Program
 * The user should be prompted to select one option and then asked for payment.
 * The program should then calculate the required change in toonies ($2), loonies ($1), quarters ($0.25), dimes ($0.10), nickels ($0.05).
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaration Section
        // List of items and their prices
        String[] items = {"Chips", "Chocolate Bar", "Pop", "Energy Drink"};
        double[] prices = {1.35, 1.65, 2.00, 3.75};

        System.out.println("Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + "\t$" + prices[i]);
        }
        System.out.println("5. Exit Program");

        // Prompt user to select an option
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Check if selected option is valid
        if (choice >= 1 && choice <= 4) {

            // Request payment Payment from user
            System.out.print("Enter payment amount: $");
            double payment = scanner.nextDouble();

            double change = payment - prices[choice - 1];

            // Calculate total number of toonies, loonies, quarters, dimes, and nickels in change
            int toonies = (int) (change / 2);
            change %= 2;
            int loonies = (int) (change / 1);
            change %= 1;
            int quarters = (int) (change / 0.25);
            change %= 0.25;
            int dimes = (int) (change / 0.10);
            change %= 0.10;
            int nickels = (int) (change / 0.05);

            // Output Section
            System.out.println("Change: ");
            System.out.println(toonies + " Toonies");
            System.out.println(loonies + " Loonies");
            System.out.println(quarters + " Quarters");
            System.out.println(dimes + " Dimes");
            System.out.println(nickels + " Nickels");
        } else if (choice == 5) {
            System.out.println("Exiting program.");
        } else {
            System.out.println("Invalid choice.");
        }

    }
}
