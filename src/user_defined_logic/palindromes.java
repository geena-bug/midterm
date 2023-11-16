package user_defined_logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class palindromes {

    public static void main(String[] args) {

        int[] values = {16, 13, 3, 4, 7, 99, 2, 88, 12, 17};

        values = sortByPrimePalindromes(values);

        System.out.println("Sorted Values: " + Arrays.toString(values));

        // expected output as per the provided values
        // Sorted Values: [2, 3, 7, 13, 17, 2, 3, 4, 7, 88, 99]

    }

    private static int[] sortByPrimePalindromes(int[] values) {
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> palindromes = new ArrayList<>();

        for (int value : values) {
            if (getPrimes(value)) {
                primes.add(value);
            }

            if (getPalindromes(values)) {
                palindromes.add(value);
            }
        }

        Collections.sort(primes);
        Collections.sort(palindromes);

        int[] sortedValues = new int[values.length];
        int index = 0;

        for (int prime : primes) {
            sortedValues[index] = prime;
            index++;
        }

        for (int palindrome : palindromes) {
            sortedValues[index] = palindrome;
            index++;
        }

        return sortedValues;
    }


    private static boolean getPalindromes(int[] values) {
        int[] original = values.clone();
        int reversed = 0;

        for (int value : values) {
            reversed = reversed * 10 + value;
        }

        return Arrays.equals(original, reverseArray(original));
    }

    private static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }


    private static boolean getPrimes(int value) {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }


}
