/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3
 

return [1,3,2].
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

public class E_67_Binary_Tree_Inorder_Traversal {

    public static void main(String[] args) {

        int[] input = {1,3,2};
        int[] output = inorderTraversal(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();

        traverse(root, result);

        return result;
    }
    
    private static void traverse(TreeNode node, ArrayList<Integer> result) {

        if (node == null) {
            return;
        }

        traverse(node.left, result);
        result.add(node.val);
        traverse(node.right, result);
    }

}
