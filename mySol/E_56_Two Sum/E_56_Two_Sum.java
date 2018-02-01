/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are zero-based.

 Notice
You may assume that each input would have exactly one solution

Example
numbers=[2, 7, 11, 15], target=9

return [0, 1]
*/

import java.util.*;

public class E_56_Two_Sum {

    public static void main(String[] args) {

        int[] input = {1, 3, 5, 11, 13};
        int[] output = twoSum(input, 8);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{i, map.get(target - numbers[i])};
            }
        }
        return new int[2];
    }

}
