/*
A robot is located at the top-left corner of a m x n grid.

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid.

How many possible unique paths are there?

 Notice
m and n will be at most 100.

Example
Given m = 3 and n = 3, return 6.
Given m = 4 and n = 5, return 35.
*/

import java.util.*;

public class E_114_Unique_Paths {

    public static void main(String[] args) {

        int inputm = 3, inputn = 3;
        int output = uniquePaths(inputm, inputn);
        System.out.println("input m: " + inputm + "input n: " + inputn + "\noutput: " + output);

    }

    /*
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public static int uniquePaths(int m, int n) {
        // write your code here
        int[][] cnt = new int[m][n];
        for (int i = 0; i < n; i++) {
            cnt[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            cnt[i][0] = 1;
            for (int j = 1; j < n; j++) {
                cnt[i][j] = cnt[i - 1][j] + cnt[i][j - 1];
            }
        }
        return cnt[m - 1][n - 1];
    }

}
