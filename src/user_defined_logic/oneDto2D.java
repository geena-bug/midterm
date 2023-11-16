package user_defined_logic;

import java.util.Arrays;

public class oneDto2D {
        public static void main(String[] args) {

            int[] values1D = {10, 11, 12, 14, 15, 17, 18, 19, 33, 45};

            int maxCols = 4;
            int[][] values2D = convert2D(values1D, maxCols);

            System.out.println(Arrays.deepToString(values2D));

            // Expected output
            // [[10, 11, 12, 14], [15, 17, 18, 19], [33, 45]]

        }

        private static int[][] convert2D(int[] values1D, int maxCols)
        {

            int totalRows = (int) Math.ceil((double) values1D.length / maxCols);
            int[][] result = new int[totalRows][];

            int index = 0;
            for (int i = 0; i < totalRows; i++) {
                int cols = Math.min(maxCols, values1D.length - index);
                result[i] = new int[cols];
                for (int j = 0; j < cols; j++) {
                    result[i][j] = values1D[index++];
                }
            }

            return result;
        }
    }
