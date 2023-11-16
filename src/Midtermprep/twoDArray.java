package Midtermprep;

public class twoDArray{

    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calling the method to calculate the sum
        int sum = calculateSum(myArray);

        // Displaying the result
        System.out.println("Sum of the elements in the 2D array: " + sum);
    }

    // Method to calculate the sum of elements in a 2D array
    public static int calculateSum(int[][] array) {
        int sum = 0;

        // Nested loops to iterate through each element in the 2D array
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                // Accumulate the sum
                sum += array[row][col];
            }
        }

        // Return the calculated sum
        return sum;
    }
}

