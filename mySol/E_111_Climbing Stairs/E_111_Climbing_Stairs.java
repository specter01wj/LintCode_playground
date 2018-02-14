/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example
Given an example n=3 , 1+1+1=2+1=1+2=3

return 3
*/

import java.util.*;

public class E_111_Climbing_Stairs {

    public static void main(String[] args) {

        int input = 6;
        int output = climbStairs(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: An integer
     * @return: An integer
     */
    public static int climbStairs(int n) {
        // write your code here
        if (n < 1) {
            return 0;
        }
        if (n < 2) {
            return n;
        }
        int preprev = 1;
        int prev = 2;
        for (int i = 2; i < n; ++i) {
            int current = prev + preprev;
            preprev = prev;
            prev = current;
        }
        return prev;
    }

}
