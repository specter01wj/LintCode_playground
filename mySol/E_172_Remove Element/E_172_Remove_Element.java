/*
Given an array and a value, remove all occurrences of that value in place and return the new length.

The order of elements can be changed, and the elements after the new length don't matter.

Example
Given an array [0,4,4,0,0,2,4,4], value=4

return 4 and front four elements of the array is [0,0,0,2]
*/

import java.util.*;

public class E_172_Remove_Element {

    public static void main(String[] args) {

        int[] input = {0,4,4,0,0,2,4,4};
        int key = 4;
        int output = removeElement(input, key);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public static int removeElement(int[] A, int elem) {
        // write your code here
        int a = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[a++] = A[i];
            }
        }

        return a;
    }

}
