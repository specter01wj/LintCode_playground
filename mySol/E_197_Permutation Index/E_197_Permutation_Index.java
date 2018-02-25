/*
Given a permutation which contains no repeated number, find its index in all the permutations of these numbers, which are ordered in lexicographical order. The index begins at 1.

Example
Given [1,2,4], return 1.
*/

import java.util.*;

public class E_197_Permutation_Index {

    public static void main(String[] args) {

        int[] input = {3,1,4};
        long output = permutationIndex(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param A: An array of integers
     * @return: A long integer
     */
    public static long permutationIndex(int[] A) {
        // write your code here
        long index = 1, fact = 1;

        for (int i = A.length - 1; i >= 0; i--) {
            int rank = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    rank++;
                }
            }
            index += rank * fact;
            fact *= A.length - i;
        }
        return index;
    }

}
