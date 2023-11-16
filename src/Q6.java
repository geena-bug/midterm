import java.util.Scanner;

/**
 * Modify question 4, so it uses a sentinel value to terminate input.
 * This means that the program should continue accepting trips until a specific value (examples: 0, -1) is entered in the kilometers travelled or the time taken. Keep this as a separate program.
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaration Section
        double totalSpeed = 0;
        int numberOfTrips = 0;

        System.out.println("Enter the distance travelled and time taken for each trip.");
        System.out.println("Enter a negative number for distance to stop input.");

        // Input data for each trip, and terminate with a sentinel value (negative distance)
        for (;;) {
            System.out.print("Enter distance for the trip (in kilometers, negative to stop): ");
            double distance = scanner.nextDouble();

            // Check if the sentinel value is entered
            if (distance < 0) {
                break;
            }

            System.out.print("Enter time taken for the trip (in hours): ");
            double time = scanner.nextDouble();

            // Speed (speed = distance / time)
            double speed = distance / time;

            System.out.println("Speed for the trip: " + speed + " KPH");

            // Add speed to totalSpeed to calculate average later in the code
            totalSpeed += speed;
            numberOfTrips++;
        }

        // Check if trip was entered to avoid division by zero
        if (numberOfTrips > 0) {
            // Calculating average speed
            double averageSpeed = totalSpeed / numberOfTrips;
            System.out.println("Average Speed of all trips: " + averageSpeed + " KPH");
        } else {
            System.out.println("No valid trips entered.");
        }

    }
}
