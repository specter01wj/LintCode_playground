/*
When Xiao Jiu came to a place to ride a cable car, he could only ride a cable car once, so he wanted to extend the cable car as much as possible. It is known that the cable car station distribution can be seen as an n x m matrix, each grid point representing the height of the cable car station. He can start a cable car from any station. The cable car can only move from a low altitude to a high altitude, taking 1unit of time. The cable car can move in eight directions. (up and down, left, right, top left, top right, bottom left, bottom right). Q. How long can Xiao Jiu ride the cable car?

Example
Given mat =

[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
return 7.

Explanation:
1→2→3→5→7→8→9 This route is the longest.
Given mat =

[
    [1,2,3],
    [6,5,4],
    [7,8,9]
]
return 9.

Explanation:
1→2→3→4→5→6→7→8→9 This route is the longest.
*/

import java.util.*;

public class E_1386_Cable_Car_Ride {

    public static void main(String[] args) {

        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int output = cableCarRide(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + (output));

    }

    /**
     * @param height: the Cable car station height
     * @return: the longest time that he can ride
     */
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int dfs(int x, int y, int n, int m, int[][] height) {
        int res = 0;
        for(int i = 0; i < 8; i++) {
            int tx = x + dx[i];
            int ty = y + dy[i];
            if(tx < 0 || tx >= n || ty < 0 || ty >= m || height[tx][ty] <= height[x][y])
                continue;
            res = Math.max(res, dfs(tx, ty, n, m, height));
        }
        return res + 1;
    }
     
    public static int cableCarRide(int[][] height) {
        // Write your code here
        int ans = 0;
        int n = height.length;
        int m = height[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int temp = dfs(i, j, n, m, height);
                ans = Math.max(ans, temp);
            }
        }
        return ans;
    }

}
