import java.util.Scanner;

/**
 * 4.	A car company wants to determine the speed of their vehicles. Write a program that allows them to input the distance travelled in kilometers and the time taken for three trips. The program should calculate and display the speed of each trip in kilometers per hour. Additionally, the program should display the average speed of all the trips.
 * These kilometer per hour (KPH) rates should be able to contain decimal values.
 * Use a for loop to obtain the data from the user.
 */
public class Q4 {
    public static void main(String[] args) {
        //Declaration Section
        Scanner scanner = new Scanner(System.in);
        int numberOfTrips = 3;
        double totalSpeed = 0;

        System.out.println("Enter the distance travelled and time taken for each trip:");

        //Input Section
        // Input data for each trip
        for (int i = 1; i <= numberOfTrips; i++) {
            System.out.print("Enter distance for trip #" + i + " (in kilometers): ");
            double distance = scanner.nextDouble();

            System.out.print("Enter time taken for trip #" + i + " (in hours): ");
            double time = scanner.nextDouble();

            // Speed (speed = distance / time)
            double speed = distance / time;

            //Output Section
            // Displaying speed for the current trip
            System.out.println("Speed for trip #" + i + ": " + speed + " KPH");

            totalSpeed += speed;
        }

        // Average speed
        double averageSpeed = totalSpeed / numberOfTrips;

        System.out.println("Average Speed of all trips: " + averageSpeed + " KPH");

    }
}
