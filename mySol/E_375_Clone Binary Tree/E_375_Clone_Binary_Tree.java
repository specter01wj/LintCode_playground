/*
For the given binary tree, return a deep copy of it.

Example
Given a binary tree:

     1
   /  \
  2    3
 / \
4   5
return the new binary tree with same structure and same value:

     1
   /  \
  2    3
 / \
4   5
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

public class E_375_Clone_Binary_Tree {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};
        TreeNode output = cloneTree(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: The root of binary tree
     * @return: root of new tree
     */
    public static TreeNode cloneTree(TreeNode root) {
        // write your code here
        if (root == null) return null;
        TreeNode newNode = new TreeNode(root.val);
        newNode.left = cloneTree(root.left);
        newNode.right = cloneTree(root.right);
        return newNode;
    }

}
