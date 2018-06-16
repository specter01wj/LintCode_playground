/*
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example
Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
*/

import java.util.*;

public class E_1231_Minimum_Moves_to_Equal_Array_Elements {

    public static void main(String[] args) {

        int[] input = {1,2,3};
        int output = minMoves(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + (output));

    }

    /**
     * @param nums: an array
     * @return: the minimum number of moves required to make all array elements equal
     */
    public static int minMoves(int[] nums) {
        // Write your code here
        int sumNum = 0;
        int minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            sumNum += num;
            minNum = Math.min(minNum, num);
        }
        return sumNum - minNum * nums.length;
    }

}
