package user_defined_logic;

import java.util.Arrays;
public class twoDto1D {

        public static void main(String []args) {

            int[][] values2D = {
                    {16, 7, 4, 9, 12},
                    {26, 72, 41},
                    {116, 117, 114, 119}
            };

            int []values1D = flatten(values2D);
            Arrays.sort(values1D);

            System.out.println("Flattened values: " + Arrays.toString(values1D));

            // expected output
            // Flattened values: [4, 7, 9, 12, 16, 26, 41, 72, 114, 116, 117, 119]

        }

        private static int[] flatten(int[][] values2D)
        {
            //count the total values(length) in 2D array
            int count =0;
            for(int []sourceRow : values2D)
            {
                for (int currentValue : sourceRow)
                {
                    count++;
                }
            }
            int []final1DValues = new int[count];
            int index =0;
            for(int []sourceRow : values2D)
            {
                //copy values from current row to 1D array
                for(int currentValue:sourceRow)
                {
                    final1DValues[index++]=currentValue;
                }
            }
            return final1DValues;
        }

    }
