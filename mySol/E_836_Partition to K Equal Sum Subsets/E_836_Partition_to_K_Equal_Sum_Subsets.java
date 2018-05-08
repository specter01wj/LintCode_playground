/*
Given an array of integers nums and a positive integer k, find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.

 Notice
1.1 <= k <= len(nums) <= 16.
2.0 < nums[i] < 10000

Example
Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
Output: True
Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
*/

import java.util.*;

public class E_836_Partition_to_K_Equal_Sum_Subsets {

    public static void main(String[] args) {

        int[] input = {4, 3, 2, 3, 5, 2, 1};
        boolean output = partitiontoEqualSumSubsets(input, 4);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param nums: a list of integer
     * @param k: an integer
     * @return: return a boolean, denote whether the array can be divided into k non-empty subsets whose sums are all equal
     */
    public static boolean partitiontoEqualSumSubsets(int[] nums, int k) {
        // write your code here
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) {
            return false;
        }
        boolean[] visit = new boolean[1 << nums.length];
        return search(0, sum, visit, nums, sum / k);
    }
    
    static boolean search(int used, int todo, boolean[] visit, int[] nums, int target) {
        if (todo == 0) {
            return true;
        }
        
        if (!visit[used]) {
            visit[used] = true;
            int remain = (todo - 1) % target + 1;
            for (int i = 0; i < nums.length; i++) {
                if ((((used >> i) & 1) == 0) && nums[i] <= remain) {
                    if (search(used | (1<<i), todo - nums[i], visit, nums, target)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
