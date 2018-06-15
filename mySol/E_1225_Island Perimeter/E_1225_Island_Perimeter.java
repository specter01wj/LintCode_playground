/*
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:

*/

import java.util.*;

public class E_1225_Island_Perimeter {

    public static void main(String[] args) {

        int[][] input = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int output = islandPerimeter(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + (output));

    }

    /**
     * @param grid: a 2D array
     * @return: the perimeter of the island
     */
    static int[] dx  = {1, 0, -1, 0};
    static int[] dy  = {0, 1, 0, -1};
    
    private static boolean valid(int x, int y, int[][] grid) {
        if (0 <= x && x < grid.length && 0 <= y && y < grid[x].length) {
            return grid[x][y] == 0;
        }
        return true;
    }
     
    public static int islandPerimeter(int[][] grid) {
        // Write your code here
        int Perimeter = 0;
        
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[i].length;j ++) {
                if(grid[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        if (valid(i + dx[k], j + dy[k], grid)) {
                            Perimeter ++;
                        }
                    }
                }
            }
        }
        return Perimeter;
    }

}
