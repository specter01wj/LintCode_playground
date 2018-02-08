/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 Notice
Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.

Example
Given the following triangle:

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
*/

import java.util.*;

public class E_109_Triangle {

    public static void main(String[] args) {

        int[][] input = { {2}, {3,4}, {6,5,7}, {4,1,8,3} };
        int output = minimumTotal(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /*
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public static int minimumTotal(int[][] triangle) {
        // write your code here
        int lenX = triangle.length;

        int[][] sum = new int[lenX][lenX];
        sum[0][0] = triangle[0][0];
        for (int i = 1; i < lenX; i++) {
            for (int j = 0; j < (i + 1); j++) {
                if (j == 0) {
                    sum[i][j] = triangle[i][j] + sum[i - 1][j];
                } else if (j == i) {
                    sum[i][j] = triangle[i][j] + sum[i - 1][j - 1];
                } else {
                    sum[i][j] = triangle[i][j] + Math.min(sum[i - 1][j], sum[i - 1][j - 1]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < lenX; j++) {
            min = Math.min(min, sum[lenX - 1][j]);
        }
        return min;
    }

}
