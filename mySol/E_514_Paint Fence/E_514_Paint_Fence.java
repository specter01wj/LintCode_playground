/*
There is a fence with n posts, each post can be painted with one of the k colors.
You have to paint all the posts such that no more than two adjacent fence posts have the same color.
Return the total number of ways you can paint the fence.

 Notice
n and k are non-negative integers.

Example
Given n=3, k=2 return 6

      post 1,   post 2, post 3
way1    0         0       1 
way2    0         1       0
way3    0         1       1
way4    1         0       0
way5    1         0       1
way6    1         1       0
*/

import java.util.*;

public class E_514_Paint_Fence {

    public static void main(String[] args) {

        int input = 3;
        int output = numWays(input, 2);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: non-negative integer, n posts
     * @param k: non-negative integer, k colors
     * @return: an integer, the total number of ways
     */
    public static int numWays(int n, int k) {
        // write your code here
        if (n == 1) return k;
        if (n == 2) return k * k;
        int prev2 = k, prev1 = k * k;
        int current = prev1;

        for (int i = 2; i < n; i++) {
            current = (k - 1) * prev1 + (k - 1) * prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

}
