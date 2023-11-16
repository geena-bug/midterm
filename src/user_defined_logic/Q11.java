package user_defined_logic;

import java.util.Calendar;

public class Q11 {

    public static void main(String[] args) {
        int month = 11;
        int year = 2023;

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Calendar for " + (month + 1) + "/" + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("%3d ", day);
            if ((day + dayOfWeek) % 7 == 0 || day == maxDay) {
                System.out.println();
            }
        }
    }
}

