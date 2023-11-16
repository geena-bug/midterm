package user_defined_logic;

public class Q14 {

    public static void main(String[] args) {
        char lowercaseLetter = 'a';
        char uppercaseLetter = convertToUppercase(lowercaseLetter);
        System.out.println("Uppercase letter: " + uppercaseLetter);
    }

    public static char convertToUppercase(char lowercaseLetter) {
        // Check if the character is a lowercase letter
        if (lowercaseLetter >= 'a' && lowercaseLetter <= 'z') {
            // Convert lowercase to uppercase using ASCII values
            return (char) (lowercaseLetter - 'a' + 'A');
        } else {
            // If the character is not a lowercase letter, return the same character
            return lowercaseLetter;
        }
    }
}

