/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

Example
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/

import java.util.*;

public class E_100_Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {

        int[] input = {2,3,5,5,7,9,9,13};
        int output = removeDuplicates(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        int a = 0, b = 0;
        while (b < nums.length) {
            nums[a++] = nums[b++];
            while (b < nums.length && nums[b] == nums[b - 1]) b++;

        }
        return a;
    }

}
