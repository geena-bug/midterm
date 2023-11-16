package Midtermprep;

import java.util.Scanner;

public class OneDArray {
    private int[] oneDArray;
    Scanner scanner = new Scanner(System.in);

    public OneDArray() {
        // Initialize the array in the constructor
        oneDArray = new int[10];
    }

    public void inputNumbers() {
        // Store the numbers in the array
        for (int num = 0; num < 10; num++) {
            System.out.print("Enter number " + (num + 1) + ": ");

            // Use nextInt() to read an integer
            oneDArray[num] = scanner.nextInt();
        }
    }

    public void displayNumbers() {
        // Show numbers entered in 1D array
        System.out.println("Inputted numbers:" + "{ }");

        for (int num = 0; num < 10; num++) {
            System.out.print(oneDArray[num] + " ");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class
        OneDArray arrayDemo = new OneDArray();

        // Call the methods to input and display numbers
        arrayDemo.inputNumbers();
        arrayDemo.displayNumbers();
    }
}
