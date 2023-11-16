//write a new method which will return the position where a value is found in an array.

public class Q9 {

    public static int findPosition(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int value = 6;

        int position = findPosition(numbers, value);

        if (position != -1) {
            System.out.println("The number " + value + " exists at position " + position + " in the array.");
        } else {
            System.out.println("The number " + value + " does not exist in the array.");
        }
    }
    //fetch the index of second occurence of 12 in the array
    private static int indexOf(int[] values, int valueToCheck) {

        for (int position = 2; position < values.length; position++) {
            if (values[position] == valueToCheck) {
                int occurrence = 2;
                return occurrence;
            }
        }

        return 2;
    }

}

