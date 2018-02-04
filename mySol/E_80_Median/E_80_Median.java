/*
Given a unsorted array with integers, find the median of it.

A median is the middle number of the array after it is sorted.

If there are even numbers in the array, return the N/2-th number after sorted.

Example
Given [4, 5, 1, 2, 3], return 3.

Given [7, 9, 4, 5], return 5.
*/

import java.util.*;

public class E_80_Median {

    public static void main(String[] args) {

        int[] input = {4, 5, 1, 2, 3};
        int output = median(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param : A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public static int median(int[] nums) {
        // write your code here
        int m = (nums.length - 1) / 2;
        int left = 0;
        int right = nums.length - 1;
        while (true) {
            if (left == right) return nums[left];
            int n = partition(nums, left, right);
            if (n == m) {
                return nums[n];
            }
            if (n > m) {
                right = n - 1;
            } else {
                left = n + 1;
            }
        }
    }
    
    private static int partition(int[] nums, int left, int right) {
        int pivot = right;
        int k = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < nums[pivot]) {
                int tmp = nums[i];
                nums[i] = nums[k];
                nums[k] = tmp;
                k++;
            }
        }
        int tmp = nums[k];
        nums[k] = nums[pivot];
        nums[pivot] = tmp;
        return k;
    }

}
