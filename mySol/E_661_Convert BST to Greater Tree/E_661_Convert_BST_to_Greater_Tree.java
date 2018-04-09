/*
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example
Given a binary search Tree `{5,2,13}｀:

              5
            /   \
           2     13
Return the root of new tree

             18
            /   \
          20     13
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

public class E_661_Convert_BST_to_Greater_Tree {

    public static void main(String[] args) {

        int[] input = {5,2,13};
        List<String> output = convertBST(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: the root of binary tree
     * @return: the new root
     */
    public static TreeNode convertBST(TreeNode root) {
        // write your code here
        convertBST(root, 0);
        return root;
    }
    
    private int convertBST(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        
        int right = convertBST(root.right, sum);
        root.val += right;
        int left = convertBST(root.left, root.val);
        return left;
    }

}
