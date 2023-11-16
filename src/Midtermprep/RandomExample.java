package Midtermprep;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        // Create a Random object with seed 1000
        Random random = new Random(1000);

        // Display the first 50 random integers between 0 and 100
        for (int i = 1; i <= 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.print(randomNumber + " ");

            // Display 10 numbers per line for better readability
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
