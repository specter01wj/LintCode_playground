/*
Given a matrix of size n x m, the elements in the matrix are 0、1、2. 0 for the sea, 1 for the island, and 2 for the city on the island(You can assume that 2 is built on 1, ie 2 also represents the island).
If two 1 are adjacent, then these two 1 belong to the same island. Find the number of islands with at least one city.

 Notice
We only consider up, down, left and right as adjacent.
n <= 100，m <= 100.
You can assume that the four sides of the matrix are surrounded by the sea.

Example
Given mat =
[
     [1,1,0,0,0],
     [0,1,0,0,1],
     [0,0,0,1,1],
     [0,0,0,0,0],
     [0,0,0,0,1]
]
, return 0.

Explanation:
There are 3 islands, but none of them contain cities.
Given mat =
[
     [1,1,0,0,0],
     [0,1,0,0,1],
     [0,0,2,1,2],
     [0,0,0,0,0],
     [0,0,0,0,2]
]
, return 2.

Explanation:
There are 3 islands, and two of them have cities.
*/

import java.util.*;

public class E_897_Island_City {

    public static void main(String[] args) {

        int[][] input = {{1,1,0,0,0}, {0,1,0,0,1}, {0,0,0,1,1}, {0,0,0,0,0}, {0,0,0,0,1}};
        int output = numIslandCities(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /**
     * @param grid: an integer matrix
     * @return: an integer 
     */
    public static int numIslandCities(int[][] grid) {
        // Write your code here
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visit = new boolean[n][m];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(visit[i][j] == false && grid[i][j] != 0) {
                    ans += dfs(visit, grid, i, j, n, m);
                }
            }
        }
        return ans;
    }
    
    static int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
     
    public static int dfs(boolean [][] visit, int [][] grid, int x, int y, int n, int m) {
        visit[x][y] = true;
        int ans = 0;
        if(grid[x][y] == 2) {
            ans++;
        }
        for(int i = 0; i < 4; i++) {
            int dx = x + dir[i][0];
            int dy = y + dir[i][1];
            if(dx >= n || dx < 0 || dy >= m || dy < 0 || visit[dx][dy] || grid[dx][dy] == 0) {
                continue;
            }
            ans += dfs(visit, grid, dx, dy, n, m);
        }
        if(ans != 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
