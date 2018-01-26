/*
Merge two given sorted integer array A and B into a new sorted integer array.

Example
A=[1,2,3,4]

B=[2,4,5,6]

return [1,2,2,3,4,4,5,6]
*/

import java.util.*;

public class E_6_Merge_Two_Sorted_Arrays {

    public static void main(String[] args) {

        int[] input1 = {1,2,3,4}; 
        int[] input2 = {2,4,5,6};
        int[] output = mergeSortedArray(input1, input2);
        System.out.println("input: " + Arrays.toString(input1) + " and " + 
            Arrays.toString(input2) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] merged = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (k < merged.length) {
            int a = i < A.length ? A[i] : Integer.MAX_VALUE;
            int b = j < B.length ? B[j] : Integer.MAX_VALUE;
            merged[k++] = a < b ? A[i++] : B[j++];
        }
        return merged;
    }
    
}
