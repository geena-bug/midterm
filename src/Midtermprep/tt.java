package Midtermprep;

public class tt {
    private static int i = 0;
    private static int j = 0;

    public static void main(String[] args) {
        int i = 2;  // Local variable in the main method
        int k = 3;

        {
            int j = 3;  // Local variable in the block
            System.out.println("i + j is " + i + j);  // Concatenation, not addition
        }

        k = i + j;  // Using the static variables i and j
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
}

