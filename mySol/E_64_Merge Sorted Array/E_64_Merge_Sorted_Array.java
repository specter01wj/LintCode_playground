/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.

 Notice
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.

Example
A = [1, 2, 3, empty, empty], B = [4, 5]

After merge, A will be filled as [1, 2, 3, 4, 5]
*/

import java.util.*;

public class E_64_Merge_Sorted_Array {

    public static void main(String[] args) {

        int[] input1 = {1,3,5,6,(Integer) null,(Integer) null}, input2 = {4,8};
        int[] output = mergeSortedArray(input1, 6, input2, 2);
        System.out.println("input: " + Arrays.toString(input1) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public static int[] mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int[] result;
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (i == -1) {
                A[k] = B[j--];
            } else if (j == -1) {
                A[k] = A[i--];
            } else if (A[i] > B[j]) {
                A[k] = A[i--];
            } else {
                A[k] = B[j--];
            }
        }
        result = A;

        return result;
    }

}
