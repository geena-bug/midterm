package user_defined_logic;

class Locatiion {
    public int row;
    public int column;
    public double maxValue;

    public Locatiion(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}

public class TestLocation {
    public static Locatiion locateLargest(double[][] a) {
        int row = 0, column = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Locatiion(row, column, maxValue);
    }


}
