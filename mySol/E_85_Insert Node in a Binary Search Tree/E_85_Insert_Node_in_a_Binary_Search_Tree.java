/*
Given a binary search tree and a new tree node, insert the node into the tree. You should keep the tree still be a valid binary search tree.

 Notice
You can assume there is no duplicate values in this tree + node.

Example
Given binary search tree as follow, after Insert node 6, the tree should be:

  2             2
 / \           / \
1   4   -->   1   4
   /             / \ 
  3             3   6

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

public class E_85_Insert_Node_in_a_Binary_Search_Tree {

    public static void main(String[] args) {

        int[] input = {2,2};
        int[] output = insertNode(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public static TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            return node;
        }
        if (node.val > root.val) {
            if (root.right == null) {
                root.right = node;
            } else {
                insertNode(root.right, node);
            }
        } else if (node.val < root.val) {
            if (root.left == null) {
                root.left = node;
            } else {
                insertNode(root.left, node);
            }
        }

        return root;
    }

}
