/*
Given an integer array, sort it in ascending order. Use selection sort, bubble sort, insertion sort or any O(n2) algorithm.

Example
Given [3, 2, 1, 4, 5], return [1, 2, 3, 4, 5].
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class N_463_Sort_Integers {

    public static void main(String[] args) {

        int input[] = {3, 2, 1, 4, 5};
        int output[] = sortIntegers(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param A: an integer array
     * @return: 
     */
    public static int[] sortIntegers(int[] A) {
        // write your code here
        for (int i = 1; i < A.length; i++) {
            int j = i;
            while (j >= 1 && A[j] < A[j - 1]) {
                int tmp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = tmp;
                j--;
            }
        }
        return A;
    }

}
