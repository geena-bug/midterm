package Midtermprep;

import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        if (a == null || a.length == 0 || a[0].length == 0) {
            return null; // Handle invalid array
        }

        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = a[maxRow][maxColumn];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        return new Location(maxRow, maxColumn, maxValue);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Prompt the user to enter a two-dimensional array
        System.out.println("Enter the array elements:");
        double[][] array = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // Locate the largest element in the array
        Location maxLocation = locateLargest(array);

        // Display the result
        System.out.println("The location of the largest element is at (" +
                maxLocation.row + ", " + maxLocation.column + ")");
        System.out.println("The largest element is: " + maxLocation.maxValue);
    }
}

