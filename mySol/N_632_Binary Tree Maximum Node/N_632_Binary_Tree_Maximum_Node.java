/*
Find the maximum node in a binary tree, return the node.

Example
Given a binary tree:

     1
   /   \
 -5     2
 / \   /  \
0   3 -4  -5 
return the node with value 3.
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

public class N_632_Binary_Tree_Maximum_Node {

    public static void main(String[] args) {

        int input = 1;
        int output = maxNode(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        TreeNode left = maxNode(root.left);
        TreeNode right = maxNode(root.right);
        if (left != null && left.val > root.val) {
            root = left;
        } 
        if (right != null && right.val > root.val) {
            root = right;
        } 
        return root;
    }

    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

}
