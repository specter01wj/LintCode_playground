/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in ZigZag-order.

Example
Given a matrix:

[
  [1, 2,  3,  4],
  [5, 6,  7,  8],
  [9,10, 11, 12]
]
return [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]
*/

import java.util.*;

public class E_185_Matrix_Zigzag_Traversal {

    public static void main(String[] args) {

        int[][] input = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
        int[] output = printZMatrix(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param matrix: An array of integers
     * @return: An array of integers
     */
    public static int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[n * m];
        int t = 0;

        for (int i = 0; i < n + m - 1; i++) {
            if (i % 2 == 1) {
                // down left
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    result[t++] = matrix[x++][y--];
                }
            } else {
                // up right
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    result[t++] = matrix[x--][y++];
                }
            }
        }
        return result;
    }

}
