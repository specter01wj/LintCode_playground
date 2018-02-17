/*
Given an integer array, find a subarray where the sum of numbers is zero. Your code should return the index of the first number and the index of the last number.

 Notice
There is at least one subarray that it's sum equals to zero.

Example
Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].
*/

import java.util.*;

public class E_138_Subarray_Sum {

    public static void main(String[] args) {

        int[] input = {-3, 1, 2, -3, 4};
        List<Integer> output = subarraySum(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public static List<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == 0) {
                result.add(i);
                result.add(i);
                return result;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    result.add(i);
                    result.add(j);
                    return result;
                }

            }
        }
        return result;
    }

}
