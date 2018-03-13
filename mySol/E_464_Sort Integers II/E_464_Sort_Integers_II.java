/*
Given an integer array, sort it in ascending order. Use quick sort, merge sort, heap sort or any O(nlogn) algorithm.

Example
Given [3, 2, 1, 4, 5], return [1, 2, 3, 4, 5].
*/

import java.util.*;

public class E_464_Sort_Integers_II {

    public static void main(String[] args) {

        int[] input = {3, 2, 1, 4, 5};
        System.out.println("input: " + Arrays.toString(input));
        sortIntegers2(input);
        int[] output = input;
        System.out.println("output: " + Arrays.toString(output));

    }

    /**
     * @param A: an integer array
     * @return: nothing
     */
    public static void sortIntegers2(int[] A) {
        // write your code here
        if (A.length <= 1) return;
        sort(A, 0, A.length - 1);
    }
    
    private static void sort(int[] A, int lo, int hi) {
        if (lo == hi) return;
        int pivot = A[(lo + hi) / 2];
        int i = lo, j = hi;
        while (i < j) {
            while (A[i] < pivot) i++;
            while (A[j] > pivot) j--;
            if (i <= j) {
                int tmp = A[i];
                A[i++] = A[j];
                A[j--] = tmp;
            }

        }

        if (lo < j) {
            sort(A, lo, j);
        }
        if (i < hi) {
            sort(A, i, hi);
        }
    }

}
