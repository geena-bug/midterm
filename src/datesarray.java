/*
What is wrong in the following code?
 public class Test {
 public static void main(String[] args) {
 java.util.Date[] dates = new java.util.Date[10];
 System.out.println(dates[0]);
 System.out.println(dates[0].toString());
 }
}
 */
import java.util.Date;
public class datesarray {
        public static void main(String[] args) {
            Date[] dates = new Date[10];

            // Initialize the first element of the array with the current date
            dates[0] = new Date();

            // Check if the element is not null before calling toString()
            if (dates[0] != null) {
                System.out.println(dates[0].toString());
            } else {
                System.out.println("The first element is null.");
            }
        }
    }

