/*
Partition an integers array into odd number first and even number second.

Example
Given [1, 2, 3, 4], return [1, 3, 2, 4]
*/

import java.util.*;

public class E_373_Partition_Array_by_Odd_and_Even {

    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        System.out.println("input: " + Arrays.toString(input));
        partitionArray(input);
        System.out.println("output: " + Arrays.toString(input));

    }

    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public static void partitionArray(int[] nums) {
        // write your code here
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (nums[i] % 2 == 1) i++;
            while (nums[j] % 2 == 0) j--;
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }

}
