package user_defined_logic;

public class Q12 {

    public static void main(String[] args) {
        int numberOfTimes = 4;
        String message = "My name is Geena.";

        displayMessage(numberOfTimes, message);
    }

    public static void displayMessage(int numberOfTimes, String message) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(message);
        }
    }
}
