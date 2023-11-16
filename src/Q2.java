import java.util.Scanner;

/**
 * Write an application that takes as input the marks of ten students,
 * determines how many are passing grades (mark >= 50) and then prints the result.
 */
public class Q2 {
    public static void main(String[] args) {

        //Declaration Section
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];
        int passingCount = 0;

        System.out.println("Enter the marks of ten students:");

        // Processing Section
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks for student #" + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Checking if the mark is a passing grade (>= 50)
            if (marks[i] >= 50) {
                passingCount++;
            }
        }

        // Output Section
        System.out.println("Number of students with passing grades: " + passingCount);

    }
}
