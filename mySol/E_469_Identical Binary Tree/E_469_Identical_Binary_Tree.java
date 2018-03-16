/*
Check if two binary trees are identical. Identical means the two binary trees have the same structure and every identical position has the same value.

Example
    1             1
   / \           / \
  2   2   and   2   2
 /             /
4             4
are identical.

    1             1
   / \           / \
  2   3   and   2   3
 /               \
4                 4
are not identical.
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

public class E_469_Identical_Binary_Tree {

    public static void main(String[] args) {

        int[] input1 = {1,2,2,4};
        int[] input2 = {1,2,2,4};
        boolean output = isIdentical(input1, input2);
        System.out.println("input1: " + Arrays.toString(input1) + "\noutput: " + output);

    }

    /*
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public static boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        } else {
            return a.val == b.val && isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
        }
    }

}
