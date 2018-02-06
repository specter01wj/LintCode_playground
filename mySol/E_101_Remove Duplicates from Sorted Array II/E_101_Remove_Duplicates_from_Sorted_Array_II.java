/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
*/

import java.util.*;

public class E_101_Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {

        int[] input = {1,1,1,2,2,3};
        int output = removeDuplicates(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length <= 2) {
            return nums.length;
        }
        boolean exceeded = false;
        int remember = -1;
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {

                if (remember == nums[i]) {
                    exceeded = true;
                } else {
                    remember = nums[i];
                    exceeded = false;
                }

                if (exceeded) {
                    continue;
                }
            }
            nums[a++] = nums[i];
        }
        return a;
    }

}
