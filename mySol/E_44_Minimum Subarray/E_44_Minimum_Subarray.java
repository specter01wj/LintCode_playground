/*
Given an array of integers, find the subarray with smallest sum.

Return the sum of the subarray.

 Notice
The subarray should contain one integer at least.

Example
For [1, -1, -2, 1], return -3.
*/

import java.util.*;

public class E_44_Minimum_Subarray {

    public static void main(String[] args) {

        int[] input = {1,-1,-2,1}; 
        int output = minSubArray(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public static int minSubArray(int[] nums) {
        // write your code here
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for (int i : nums) {
            sum += i;
            minSum = Math.min(sum, minSum);
            sum = (sum > 0 ? 0 : sum);
        }

        return minSum;
    }
    
}
