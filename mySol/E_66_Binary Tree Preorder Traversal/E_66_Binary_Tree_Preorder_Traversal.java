/*
Given a binary tree, return the preorder traversal of its nodes' values.

Example
Given:

    1
   / \
  2   3
 / \
4   5
return [1,2,4,5,3].
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

public class E_66_Binary_Tree_Preorder_Traversal {

    public static void main(String[] args) {

        int[] input = {1,2,4,5,3};
        int[] output = preorderTraversal(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();

        traverse(root, result);

        return result;
    }
    
    private static void traverse(TreeNode node, ArrayList<Integer> result) {

        if (node == null) {
            return;
        }

        result.add(node.val);
        traverse(node.left, result);
        traverse(node.right, result);
    }

}
