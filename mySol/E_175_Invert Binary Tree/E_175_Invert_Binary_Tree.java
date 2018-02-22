/*
Invert a binary tree.

Example
  1         1
 / \       / \
2   3  => 3   2
   /       \
  4         4
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

public class E_175_Invert_Binary_Tree {

    public static void main(String[] args) {

        int[] input = {1,2,3,#,4,#};
        invertBinaryTree(input);
        System.out.println("input: " + input + "\noutput: " + input);

    }

    /*
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public static void invertBinaryTree(TreeNode root) {
        // write your code here
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }

}
