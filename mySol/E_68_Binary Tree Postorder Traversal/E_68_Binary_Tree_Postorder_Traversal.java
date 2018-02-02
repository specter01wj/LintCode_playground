/*
Given a binary tree, return the postorder traversal of its nodes' values.

Example
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3
 

return [3,2,1].
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

public class E_68_Binary_Tree_Postorder_Traversal {

    public static void main(String[] args) {

        int[] input = {1,#,2,3};
        int[] output = postorderTraversal(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param root: A Tree
     * @return: Postorder in ArrayList which contains node values.
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
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
        traverse(node.right, result);
        result.add(node.val);
    }

}
