/*
Given two arrays, write a function to compute their intersection.

 Notice
Each element in the result must be unique.
The result can be in any order.

Example
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
*/

import java.util.*;

public class E_547_Intersection_of_Two_Arrays {

    public static void main(String[] args) {

        int[] input1 = {1, 2, 2, 1};
        int[] input2 = {2, 2};
        int[] output = intersection(input1, input2);
        System.out.println("input1: " + Arrays.toString(input1) + 
            " input2: " + Arrays.toString(input2) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) set1.add(i);

        Set<Integer> result = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                result.add(i);
            }
        }
        ;

        int[] arr = new int[result.size()];
        int k = 0;
        for (int i : result) {
            arr[k++] = i;
        }

        return arr;
    }

}
