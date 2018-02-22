/*
Given a sorted (increasing order) array, Convert it to create a binary tree with minimal height.

 Notice
There may exist multiple valid solutions, return any of them.

Example
Given [1,2,3,4,5,6,7], return

     4
   /   \
  2     6
 / \    / \
1   3  5   7
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

import java.util.*;

public class E_177_Convert_Sorted_Array_to_Binary_Search_Tree_With_Minimal_Height {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7};
        TreeNode output = sortedArrayToBST(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + input);

    }

    /*
     * @param A: an integer array
     * @return: A tree node
     */
    public static TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if (A.length == 0) {
            return null;
        }

        if (A.length == 1) {
            return new TreeNode(A[0]);
        }

        int mid = (A.length + 1) / 2 - 1;
        TreeNode node = new TreeNode(A[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(A, 0, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(A, mid + 1, A.length));

        return node;
    }

}
