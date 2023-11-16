public class Q10 {

    public static void main(String[] args) {
        double number = 16.0; // Replace this with the number for which you want to calculate the square root
        double result = calculateSquareRoot(number);
        System.out.println("Square root of " + number + " is: " + result);
    }

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            System.out.println("Input must be a non-negative number.");
        }

        double num = 1e-15; //  value for precision
        double assume = number; // Initial assume for square root

        while (Math.abs(assume - number / assume) > num * assume) {
            assume = (number / assume + assume) / 2.0; // Newton's method for approximating square root
        }

        return assume;
    }
}
