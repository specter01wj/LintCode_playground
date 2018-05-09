/*
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example
Input:nums = [1,1,1], k = 2
Output: 2
*/

import java.util.*;

public class E_838_Subarray_Sum_Equals_K {

    public static void main(String[] args) {

        int[] input = {1, 1, 1};
        int output = subarraySumEqualsK(input, 2);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param nums: a list of integer
     * @param k: an integer
     * @return: return an integer, denote the number of continuous subarrays whose sum equals to k
     */
    public static int subarraySumEqualsK(int[] nums, int k) {
        // write your code here
        int[] sum = new int[nums.length + 1];
        
        sum[0] = 0;
        for(int i = 1;i < nums.length +1; i++){
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sum.length; i++){
            if(map.containsKey(sum[i] - k)){
                count+=map.get(sum[i] - k);
            }
            
            if(map.containsKey(sum[i])){
                map.put(sum[i], map.get(sum[i]) +1);
            }else{
                map.put(sum[i], 1);
            }
        }
        return count;
    }

}
