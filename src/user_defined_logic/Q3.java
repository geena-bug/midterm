package user_defined_logic;

import java.util.Arrays;

public class Q3 {

    public static void main(String []args) {

        int[][] values2D = {
                {16, 7, 4, 9, 12},
                {26, 72, 41},
                {116, 117, 114, 119}
        };

        int[] values1D = flatten(values2D);
        Arrays.sort(values1D);

        System.out.println("Flattened values: " + Arrays.toString(values1D));

        // expected output
        // Flattened values: [4, 7, 9, 12, 16, 26, 41, 72, 114, 116, 117, 119]
    }

    private static int[] flatten(int[][] values2D) {
        int totalLength = 0;
        for (int i = 0; i < values2D.length; i++) {
            totalLength += values2D[i].length;
        }
        int[] flattenedArray = new int[totalLength];
        int index = 0;
        for (int i = 0; i < values2D.length; i++) {
            for (int j = 0; j < values2D[i].length; j++) {
                flattenedArray[index++] = values2D[i][j];
            }
        }
        return flattenedArray;
    }
}