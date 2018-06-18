/*
Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
*/

import java.util.*;

public class E_1237_Number_of_Boomerangs {

    public static void main(String[] args) {

        int[][] input = {{0,0},{1,0},{2,0}};
        int output = numberOfBoomerangs(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + (output));

    }

    /**
     * @param points: a 2D array
     * @return: the number of boomerangs
     */
    private static int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }
     
    public static int numberOfBoomerangs(int[][] points) {
        // Write your code here
        if (points == null) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> disCount = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int distance = getDistance(points[i], points[j]);
                int count = disCount.getOrDefault(distance, 0);
                disCount.put(distance, count + 1);
            }
            for (int count : disCount.values()) {
                ans += count * (count - 1);
            }
        }
        return ans;
    }

}
