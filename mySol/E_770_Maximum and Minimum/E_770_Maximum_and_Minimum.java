/*
Given a matrix, return the maximum number and the minimum number.

 Notice
Your need to return a integer array, that array[0] represent the maximum and array[1] represent the minimum.

Example
Given a matrix:

[
 [1,2,3],
 [4,3,2],
 [6,4,4]
]
return [6,1]
*/

import java.util.*;

public class E_770_Maximum_and_Minimum {

    public static void main(String[] args) {

        int[][] input = { {1,2,3}, {4,3,2}, {6,4,4} };
        int[] output = maxAndMin(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param matrix: an input matrix 
     * @return: nums[0]: the maximum,nums[1]: the minimum
     */
    public static int[] maxAndMin(int[][] matrix) {
        // write your code here
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        
        int[] res = new int[2];
        int i, j;
        res[0] = Integer.MIN_VALUE;
        res[1] = Integer.MAX_VALUE;
        for (i = 0; i < matrix.length; ++i) {
            for (j = 0; j < matrix[i].length; ++j) {
                res[0] = Math.max(res[0], matrix[i][j]);
                res[1] = Math.min(res[1], matrix[i][j]);
            }
        }
        
        return res;
    }

}
