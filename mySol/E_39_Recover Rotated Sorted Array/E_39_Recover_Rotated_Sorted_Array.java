/*
Given a rotated sorted array, recover it to sorted array in-place.

Clarification
What is rotated array?

For example, the orginal array is [1,2,3,4], The rotated array of it can be [1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
Example
[4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
*/

import java.util.*;

public class E_39_Recover_Rotated_Sorted_Array {

    public static void main(String[] args) {
        
        Integer[] input = {4, 5, 1, 2, 3}; 
        List<Integer> intList = Arrays.asList( input );
        
        List<Integer> output = recoverRotatedSortedArray(intList);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: An integer array
     * @return: nothing
     */
    public static List<Integer> recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int size = nums.size();
        int i;
        for (i = 1; i < size; i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                break;
            }
        }

        nums = reverse(nums, 0, i - 1);
        nums = reverse(nums, i, size - 1);
        nums = reverse(nums, 0, size - 1);

        return nums;
    }

    private static List<Integer> reverse(List<Integer> nums, int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int tmp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j, tmp);
            i++;
            j--;
        }

        return nums;
    }
    
}
