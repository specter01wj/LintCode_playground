/*
Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

Example
Example 1:

Input: [4,2,3]
Output: True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
Example 2:

Input: [4,2,1]
Output: False
Explanation: You can't get a non-decreasing array by modify at most one element.
*/

import java.util.*;

public class E_1099_Non_decreasing_Array {

    public static void main(String[] args) {

        int[] input = {4, 2, 3};
        boolean output = checkPossibility(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));

    }

    /**
     * @param nums: an array
     * @return: if it could become non-decreasing by modifying at most 1 element
     */
    public static boolean checkPossibility(int[] nums) {
        // Write your code here
        int n = nums.length;
        int pos = 0, count = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                pos = i;
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        if (count > 1) {
            return false;
        }
        return pos == 1 || pos == n - 1 || nums[pos - 2] <= nums[pos] 
            || nums[pos - 1] <= nums[pos + 1];
    }

}
