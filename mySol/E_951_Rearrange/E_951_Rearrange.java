/*
Given an array required to be rearranged, which means all the numbers on the even-numbered bits are less than those on the odd-numbered bits. At the same time, the even-numbered bits are sorted in ascending order, and the odd-numbered bits are also sorted in ascending order.

 Notice
The length of the array is n，n <= 100000。
The index of the array is started from 0.

Example
Given array = [-1,0,1,-1,5,10], return [-1,1,-1,5,0,10].

Explanation:
[-1,1,-1,5,0,10] meets the requirements.
Given array = [2,0,1,-1,5,10], return [-1,2,0,5,1,10].

Explanation:
[-1,2,0,5,1,10] meets the requirements.
*/

import java.util.*;

public class E_951_Rearrange {

    public static void main(String[] args) {

        int[] input = {-1,0,1,-1,5,10};
        int[] output = rearrange(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param nums: the num arrays 
     * @return: the num arrays after rearranging
     */
    public static int[] rearrange(int[] nums) {
        // Write your code here 
        Arrays.sort(nums);
        int [] ans = new int[nums.length];
        int pos = 0;
        for(int i = 0; i < ans.length; i += 2) {
            ans[i] = nums[pos++];
        }
        for(int i = 1; i < ans.length; i += 2) {
            ans[i] = nums[pos++];
        }
        return ans;
    }

}
