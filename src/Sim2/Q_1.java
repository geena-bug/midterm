//package Sim2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//
//    public static void main(String[] args) {
//
//        int[] values = {16, 13, 3, 4, 7, 99, 2, 88, 12, 17};
//
//        values = sortByPrimePalindromes(values);
//
//        System.out.println("Sorted Values: " + Arrays.toString(values));
//
//        // expected output as per the provided values
//        // Sorted Values: [2, 3, 7, 13, 17, 2, 3, 4, 7, 88, 99]
//
//    }
//
//    private static int[] sortByPrimePalindromes(int[] values) {
//        ArrayList<Integer> primes = new ArrayList<>();
//        ArrayList<Integer> palindromes = new ArrayList<>();
//
//        for (int value : values) {
//            if (getPrimes(values)) {
//                primes.add(value);
//            }
//
//            if (getPalindromes(values)) {
//                palindromes.add(values);
//            }
//        }
//
//        Collections.sort(primes);
//        Collections.sort(palindromes);
//
//        int[] sortedValues = new int[values.length];
//        int index = 0;
//
//        for (int prime : primes) {
//            sortedValues[index] = prime;
//            index++;
//        }
//
//        for (int palindrome : palindromes) {
//            sortedValues[index] = palindrome;
//            index++;
//        }
//
//        return sortedValues;
//
//        return values;
//    }
//
//
//    private static boolean getPalindromes(int[] values) {
//        int[][] original = new int[][]{values};
//        int reversed = 0;
//
//        while (values != 0) {
//            int digit = values % 10;
//            reversed = reversed * 10 + digit;
//            values /= 10;
//        }
//
//        //return original == reversed;
//
//
//        return new int[]{values};
//    }
//
//    private static boolean getPrimes(int[] values) {
//        if (values <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i * i <= values; i++) {
//            if (values % i == 0) {
//                return false;
//           }
//        }
//       return values;
//    }
//
