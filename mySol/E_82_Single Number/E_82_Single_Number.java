/*
Given 2*n + 1 numbers, every numbers occurs twice except one, find it.

Example
Given [1,2,2,1,3,4,3], return 4
*/

import java.util.*;

public class E_82_Single_Number {

    public static void main(String[] args) {

        int[] input = {1,2,2,1,3,6,4,3,6};
        int output = singleNumber(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param A: An integer array
     * @return: An integer
     */
    public static int singleNumber(int[] A) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for (int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }

        return n;
    }

}
