/*
Given two arrays, write a function to compute their intersection.

 Notice
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

Example
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
*/

import java.util.*;

public class E_548_Intersection_of_Two_Arrays_II {

    public static void main(String[] args) {

        int[] input1 = {1, 2, 3, 3, 4, 2, 1};
        int[] input2 = {2, 3, 3, 8};
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
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; ++i) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1); 
            else
                map.put(nums1[i], 1);
        }

        List<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i < nums2.length; ++i)
            if (map.containsKey(nums2[i]) &&
                map.get(nums2[i]) > 0) {
                results.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1); 
            }

        int result[] = new int[results.size()];
        for(int i = 0; i < results.size(); ++i)
            result[i] = results.get(i);

        return result;
    }

}
