/*
Input is an integer array arr. Please return the result array ans so that ans[i] is the product of all the numbers except arr[i] in arr.

Example
Given arr = [2,3,4,1], return[12,8,6,24].

Explanation:
3 * 4 * 1 = 12, 1 * 4 * 1 = 8, 2 * 3 * 1= 6, 2 * 3 * 4 = 24.
Given arr = [1,2], return[2,1].

Explanation:
2 = 2, 1 = 1.
*/

import java.util.*;

public class E_1415_Residual_Product {

    public static void main(String[] args) {

        int[] input = {2,3,4,1};
        int[] output = getProduct(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param arr: The array you should handle
     * @return: Return the product
     */
    public static int[] getProduct(int[] arr) {
        // Write your code here
        if(arr.length == 1) {
            int[] ans = new int[1];
            ans[0] = 0;
            return ans;
        }
        int[] pre = new int[arr.length];
        int[] suf = new int[arr.length];
        int[] ans = new int [arr.length];
        pre[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            pre[i] = arr[i] * pre[i - 1];
        }
        suf[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * arr[i];
        }
        ans[0] = suf[1];
        ans[arr.length - 1] = pre[arr.length - 2];
        for(int i = 1; i <= arr.length - 2; i++) {
            ans[i] = pre[i - 1] * suf[i + 1];
        }
        return ans;
    }

}
