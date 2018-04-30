/*
Given an integer n, return a spiral array of n * n sizes.

Example
Example1:
Given n = 3
the spiral array is:

[
[1,2,3]
[8,9,4]
[7,6,5]
]
Example2:
Given n = 5
the spiral array is:

[
 [1,2,3,4,5]
 [16,17,18,19,6]
 [15,24,25,20,7]
 [14,23,22,21,8]
 [13,12,11,10,9]
]
*/

import java.util.*;

public class E_769_Spiral_Array {

    public static void main(String[] args) {

        int input = 3;
        int[][] output = spiralArray(input);
        System.out.println("input: " + input + "\noutput: " + Arrays.deepToString(output));

    }

    /**
     * @param n: a Integer
     * @return: a spiral array
     */
    public static int[][] spiralArray(int n) {
        // write your code here
        int[][] res = new int[n][n];
                      // right, down, left, up
        int[] dx = new int[]{0, 1, 0, -1}; // row index's change in 4 directions
        int[] dy = new int[]{1, 0, -1, 0}; // column index's change in 4 directions
        
        // currently: x, y
        // direction d
        // next grid: (x + dx[d], y + dy[d])
        
        int x, y, d;
        int i, j, nx, ny;
        // initialization
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                res[i][j] = -1; // (i,j) has not been filled yet
            }
        }
        
        x = 0;
        y = 0;
        d = 0;
        for (i = 1; i <= n * n; ++i) {
            res[x][y] = i; // fill in i at (x, y)
            // explore
            nx = x + dx[d];
            ny = y + dy[d];
            // next grid along direction d is (nx, ny)
            // rorate if it's outside of the matrix or the grid has been filled
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || res[nx][ny] != -1) {
                // rotate
                // direction d: 0-->1, 1-->2, 2-->3, 3-->0
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
            }
            
            x = nx;
            y = ny;
        }
        
        return res;
    }

}
