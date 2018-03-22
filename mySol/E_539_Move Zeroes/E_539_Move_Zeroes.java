/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Notice
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

Example
Given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*/

import java.util.*;

public class E_539_Move_Zeroes {

    public static void main(String[] args) {

        int[] input = {0, 1, 0, 3, 12};
        System.out.println("input: " + Arrays.toString(input));
        moveZeroes(input);
        System.out.println("output: " + Arrays.toString(input));

    }

    /*
     * @param nums: an integer array
     * @return: 
     */
    public static void moveZeroes(int[] nums) {
        // write your code here
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int j = i;
                while (j >= 1 && nums[j - 1] == 0) j--;
                if (nums[j] == 0) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
    }

}
