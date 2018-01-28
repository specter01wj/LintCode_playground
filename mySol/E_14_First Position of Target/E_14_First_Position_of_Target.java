/*
For a given sorted array (ascending order) and a target number, find the first index of this number in O(log n) time complexity.

If the target number does not exist in the array, return -1.

Example
If the array is [1, 2, 3, 3, 4, 5, 10], for given target 3, return 2.
*/

import java.util.*;

public class E_14_First_Position_of_Target {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 3, 4, 5, 10};
        int output = binarySearch(input, 3);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public static int binarySearch(int[] nums, int target) {
        //write your code here
        int hi = nums.length - 1;
        int lo = 0;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] > target || (nums[mid] == target && mid > 0 && nums[mid - 1] == target)) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
