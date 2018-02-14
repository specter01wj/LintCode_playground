/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Notice
You can only move either down or right at any point in time.
*/

import java.util.*;

public class E_110_Minimum_Path_Sum {

    public static void main(String[] args) {

        int[][] input = { {2,5,9}, {3,6,4}, {6,5,7}, {4,8,3} };
        int output = minPathSum(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /*
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public static int minPathSum(int[][] grid) {
        // write your code here
        int lenX = grid.length;
        int lenY = grid[0].length;
        int[][] sum = new int[lenX][lenY];

        sum[0][0] = grid[0][0];
        for (int i = 1; i < lenX; i++) {
            sum[i][0] = grid[i][0] + sum[i - 1][0];
        }

        for (int j = 1; j < lenY; j++) {
            sum[0][j] = grid[0][j] + sum[0][j - 1];
        }

        for (int i = 1; i < lenX; i++) {
            for (int j = 1; j < lenY; j++) {
                sum[i][j] = Math.min(sum[i][j - 1], sum[i - 1][j]) + grid[i][j];
            }
        }

        return sum[lenX - 1][lenY - 1];
    }

}
