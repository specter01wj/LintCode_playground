/*
Merge two given sorted integer array A and B into a new sorted integer array.

Example
A=[1,2,3,4]

B=[2,4,5,6]

return [1,2,2,3,4,4,5,6]
*/

import java.util.*;

public class E_41_Maximum_Subarray {

    public static void main(String[] args) {

        int[] input = {-2,2,-3,4,-1,2,1,-5,3}; 
        int output = maxSubArray(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public static int maxSubArray(int[] nums) {
        // write your code here
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            sum = (sum < 0 ? 0 : sum);
        }

        return maxSum;
    }
    
}
