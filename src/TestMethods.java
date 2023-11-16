//import user_defined_logic.MyMethods;
//
//import java.util.Arrays;
//
//public class TestMethods {
//
//    public static void main(String[] args) {
//        int totalValuesRequired = 10;
//        int maxValuePermitted = 15;
//
//        int[] values = MyMethods.generateValues(totalValuesRequired, maxValuePermitted);
//        System.out.println(Arrays.toString(values));
//
//        int total = MyMethods.computeTotal(values);
//        System.out.println("Total : " + total);
//
//        final int TYPE_EVEN = 0;
//        final int TYPE_ODD = 1;
//
//        int[] filteredEvenValues = MyMethods.filterValues(values, TYPE_EVEN);
//        System.out.println(Arrays.toString(filteredEvenValues));
//
//        int[] filteredOddValues = MyMethods.filterValues(values, TYPE_ODD);
//        System.out.println(Arrays.toString(filteredOddValues));
//
//        // check whether a value exists in the set
//        // complete using a user-defined method from your own library class
//        int value =0;
//        int[] check = MyMethods.exists(value, 5);
//        System.out.println(Arrays.toString(check));
////        int valueToCheck = 10;
////        int index = countIndexOf(values, valueToCheck);
////        if (index != -1) {
////            System.out.println("Value " + valueToCheck + " found at index: " + index);
////        } else {
////            System.out.println("Value " + valueToCheck + " not found in the array.");
////        }
//
//        // write a method to display a 2D array
//        int[] displayValues = MyMethods.displayArray(values);
//        System.out.println(Arrays.toString(displayValues));
//
//        public static display2DArray(int[][] array);
//            for (int[] row : array) {
//                for (int valueD : row) {
//                    System.out.print(valueD + " ");
//                }
//                System.out.println();
//            }
//        }
//
//
//
//
//
//    }
//    // count the occurrences of a value from the set
//    // complete using a user-defined method from your own library class
//
//    private int output;
//    int[] occurrences = MyMethods.exists(output, 5);
//
//    private static int countIndexOf(int[] values, int valueToCheck) {
//        for (int position = values.length - 1; position >= 0; position--) {
//            if (values[position] == valueToCheck) {
//                return position;
//            }
//        }
//        return -1;
//    }
//}