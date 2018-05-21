/*
Given a two-dimensional matrix, the value of each grid represents the height of the terrain. The flow of water will only flow up, down, right and left, and it must flow from the high ground to the low ground. As the matrix is surrounded by water, it is now filled with water from (R,C) and asked if water can flow out of the matrix.

 Notice
The input matrix size is n x n, n <= 200.
Ensure that each height is a positive integer.

Example
Given

mat =
[
    [10,18,13],
    [9,8,7],
    [1,2,3]
]
R = 1, C = 1, return "YES"。

Explanation:
(1,1) →(1,2)→Outflow.
Given

mat = 
[
    [10,18,13],
    [9,7,8],
    [1,11,3]
]
R = 1, C = 1, return "NO"。

Explanation:
Since (1,1) cannot flow to any other grid, it cannot flow out.
*/

import java.util.*;

public class E_1410_Matrix_Water_Injection {

    public static void main(String[] args) {

        int[][] input = {{10,18,13},{9,8,7},{1,2,3}};
        int R = 1, C = 1;
        String output = waterInjection(input, R, C);
        System.out.println("input: " + Arrays.deepToString(input) +
                            " R: " + (R) + " C: " + (C) + "\noutput: " + (output));

    }

    /**
     * @param matrix: the height matrix
     * @param R: the row of (R,C)
     * @param C: the columns of (R,C)
     * @return: Whether the water can flow outside
     */
    class Pair {
        public int x;
        public int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    } 
    
    int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
     
    public static String waterInjection(int[][] matrix, int R, int C) {
        // Write your code here
        int[][] vis = new int[matrix.length][matrix[0].length];
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(R, C));
        vis[R][C]=1;
        while(!q.isEmpty()) {
            Pair x = q.poll();
            if(x.x == 0 || x.x == matrix.length - 1 || x.y == 0 || x.y == matrix[0].length - 1) {
                return "YES";
            }
            int num = matrix[x.x][x.y];
            for(int i = 0; i < 4; i++) {
                int tx = x.x + dir[i][0];
                int ty = x.y + dir[i][1];
                if(tx < 0 || tx >= matrix.length || ty < 0 || ty >= matrix[0].length) {
                    continue;
                }
                if(matrix[tx][ty] < num && vis[tx][ty] == 0) {
                    q.offer(new Pair(tx,ty));
                    vis[tx][ty] = 1;
                }
            }
        }
        return "NO";
    }

}
