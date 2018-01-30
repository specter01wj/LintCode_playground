/*
Given an array of integers, the majority number is the number that occurs more than half of the size of the array. Find it.

 Notice
You may assume that the array is non-empty and the majority number always exist in the array.

Example
Given [1, 1, 1, 1, 2, 2, 2], return 1
*/

import java.util.*;

public class E_46_Majority_Number {

    public static void main(String[] args) {

        int[] input = {1,1,1,1,2,2,2}; 
        int output = majorityNumber(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public static int majorityNumber(int[] nums) {
        // write your code here
        int cnt = 0;
        int n = 0;
        for (int i : nums) {
            if (cnt == 0) {
                n = i;
                cnt++;
            } else if (i == n) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return n;
    }
    
}
