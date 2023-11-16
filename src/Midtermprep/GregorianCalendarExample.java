package Midtermprep;

import java.util.GregorianCalendar;

public class GregorianCalendarExample {

    public static void main(String[] args) {
        // Task 1: Display the current year, month, and day
        displayCurrentDate();

        // Task 2: Set elapsed time and display the year, month, and day
        setElapsedTimeAndDisplay(1234567898765L);
    }

    private static void displayCurrentDate() {
        // Create a GregorianCalendar instance for the current date
        GregorianCalendar calendar = new GregorianCalendar();

        // Display current year, month, and day
        System.out.println("Current Date:");
        displayDate(calendar);
        System.out.println();
    }

    private static void setElapsedTimeAndDisplay(long elapsedTime) {
        // Create a GregorianCalendar instance and set the elapsed time
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        // Display date based on elapsed time
        System.out.println("Date with Elapsed Time 1234567898765 milliseconds:");
        displayDate(calendar);
    }

    private static void displayDate(GregorianCalendar calendar) {
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is 0-based
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
