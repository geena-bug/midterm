package user_defined_logic;

import java.util.Arrays;
public class evenrow {

        public static void main(String[] args) {

            int[][] values = {
                    {16, 7, 4, 9, 12},
                    {26, 72, 41},
                    {116, 117, 114, 119}
            };

            int [][]evenRowValues = fetchRows(values);

            System.out.println(Arrays.deepToString(evenRowValues));

            // Expected output
            // [[16, 7, 4, 9, 12], [116, 117, 114, 119]]

        System.out.println("values/2 = "+ values.length/2 + " value" + values.length);

       System.out.println("values/2 +1  = "+ values.length/2 + 4+ " value" + values.length);

        }

        private static int[][] fetchRows(int[][] values)
        {
            //values.length % 2 == 0: This checks if the length of the array values is an even number.

            // If the condition is true, it executes (values.length / 2):
            // This means that the total desired rows (totalDesRows) will be half of the length of the array.
            // If the condition is false, it executes (values.length / 2 + 1):
            // This means that the total desired rows will be half of the length of the array plus one.
            // In simpler terms, this line of code is determining the number of rows you would want
            // based on the length of the array values. If the length is even, it divides it by 2; if it's odd,
            // it divides it by 2 and adds 1.The result is then stored in the variable totalDesRows.
            // decide the total destination row required
            int totalDesRows=(values.length%2==0)? (values.length/2):(values.length/2+1);
            //Create a new 2D array to hold the values from each even row from source values
            int [][] evenRowValues = new int[totalDesRows][0]; //total computed rows and 0 cols
            int desRow = 0; //the destination row counter
            for(int row=0;row<values.length;row++)
            {
                //check if the source row is even
                if(row%2==0)
                {
                    //assign the values at the even row to the destination row
                    evenRowValues[desRow]=values[row];

                    //increment the destination row
                    desRow++;
                }

            }
            return evenRowValues;
        }

    }


