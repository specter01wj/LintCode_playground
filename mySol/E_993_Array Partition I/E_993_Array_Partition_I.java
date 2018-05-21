/*
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

 Notice
1.n is a positive integer, which is in the range of [1, 10000].
2.All the integers in the array will be in the range of [-10000, 10000].

Have you met this question in a real interview? 
Example
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
*/

import java.util.*;

public class E_993_Array_Partition_I {

    public static void main(String[] args) {

        int[] input = {1,4,3,2};
        System.out.println("input: " + Arrays.toString(input));
        int output = arrayPairSum(input);
        System.out.println("output: " + (output));

    }

    /**
     * @param nums: an array
     * @return: the sum of min(ai, bi) for all i from 1 to n
     */
    public static int arrayPairSum(int[] nums) {
        // Write your code here
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }

}
