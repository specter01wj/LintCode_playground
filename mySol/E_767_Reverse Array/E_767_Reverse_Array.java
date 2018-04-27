/*
Reverse the given array nums inplace.

 Notice
Inplace means you can't use extra space.

Example
Given nums = [1,2,5]
return [5,2,1]
*/

import java.util.*;

public class E_767_Reverse_Array {

    public static void main(String[] args) {

        int[] input = {1,2,5};
        System.out.println("input: " + Arrays.toString(input));
        reverseArray(input);
        System.out.println("output: " + Arrays.toString(input));

    }

    /**
     * @param nums: a integer array
     * @return: nothing
     */
    public static void reverseArray(int[] nums) {
        // write your code here
        int i = 0;
        int j = nums.length - 1;
        int tmp;
        
        // i and j not meet yet
        while (i < j) {
            // swap nums[i] and nums[j]
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            
            // ++i;
            // --j;
            i += 1;
            j -= 1;
        }
    }

}
