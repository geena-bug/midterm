package user_defined_logic;

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}

public class location {
    public static Locatiion locateLargest(double[][] a) {
        int row = 0, column = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Locatiion(row, column, maxValue);
    }

    // Test program
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter the number of rows and columns
//        System.out.print("Enter the number of rows: ");
//        int rows = scanner.nextInt();
//
//        System.out.print("Enter the number of columns: ");
//        int columns = scanner.nextInt();
//
//        // Create a two-dimensional array
//        double[][] array = new double[rows][columns];
//
//        // Prompt the user to enter values for each element in the array
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = scanner.nextDouble();
//            }
//        }
//
//        // Call the locateLargest method passing the array as the argument
//        Location largestLocation = locateLargest(array);
//
//        // Display the result using the returned Location object
//        System.out.println("The largest element is located at row " + largestLocation.row + ", column " + largestLocation.column);
//
    }
//}



