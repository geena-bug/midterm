package user_defined_logic;
public class Min {
    public static void main(String[] args) {
        int[][] generatedMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int max = findMax(generatedMatrix);
        int min = findMin(generatedMatrix);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        return max;
    }

    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }

        return min;
    }
}


