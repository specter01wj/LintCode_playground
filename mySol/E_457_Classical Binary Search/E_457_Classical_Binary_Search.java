/*
Find any position of a target number in a sorted array. Return -1 if target does not exist.

Example
Given [1, 2, 2, 4, 5, 5].

For target = 2, return 1 or 2.

For target = 5, return 4 or 5.

For target = 6, return -1.
*/

import java.util.*;

public class E_457_Classical_Binary_Search {

    public static void main(String[] args) {

        int[] input = {1,2,2,4,5,5};
        int output = findPosition(input, 5);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public static int findPosition(int[] nums, int target) {
        // write your code here
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int mid = (lower + upper) >> 1;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
            
        }
        return -1;
    }

}
