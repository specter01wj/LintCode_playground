/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example
Given binary tree A = {3,9,20,#,#,15,7}, B = {3,#,20,15,7}

A)  3            B)    3 
   / \                  \
  9  20                 20
    /  \                / \
   15   7              15  7
The binary tree A is a height-balanced binary tree, but B is not.
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

public class E_93_Balanced_Binary_Tree {

    public static void main(String[] args) {

        int[] input = {3,9,20,#,#,15,7};
        boolean output = isBalanced(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return balanced(root) != -1;
    }
    
    private int balanced(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = balanced(root.left);
        int right = balanced(root.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        if (Math.abs(left - right) <= 1) {
            return Math.max(left, right) + 1;
        } else {
            return -1;
        }
    }

}
