import java.util.Scanner;

/**
 * Modify the program in question two so that it uses a nested loop to validate the inputs.
 * All marks entered must be between 0 and 100.  You will only need this version of the program.
 */
public class Q3 {
    //Declaration Section
    public static void main(String[] args) {

        //Declaration Section
        Scanner scanner = new Scanner(System.in);
        int PassMark = 0;

        System.out.println("Enter the marks of ten students:");

        //Processing Section
        // Outer loop for ten students
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter marks for student #" + i + ": ");
            int marks = scanner.nextInt();

            // (Check that marks are between 0 and 100)
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid number, Marks should be between 0 and 100.");
                System.out.print("Enter marks for student #" + i + ": ");
                marks = scanner.nextInt();
            }

            // Check if the mark is a passing grade (>= 50)
            if (marks >= 50) {
                PassMark++;
            }
        }

        // Output Section
        System.out.println("Number of students with passing grades: " + PassMark);

    }
}
