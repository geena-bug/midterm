import java.util.Scanner;

/**
 * Modify question 4 so that the user can input the number of trips. Keep this as a separate program.
 */
public class Q5 {
    public static void main(String[] args) {
        //Declaration Section
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of trips: ");
        int numberOfTrips = scanner.nextInt();
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

            // Speed for the current trip
            System.out.println("Speed for trip #" + i + ": " + speed + " KPH");

            totalSpeed += speed;
        }

        // Average speed
        double averageSpeed = totalSpeed / numberOfTrips;

        // Output Section
        System.out.println("Average Speed of all trips: " + averageSpeed + " KPH");

    }
}
