/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Example
Given a binary tree as follow:

  1
 / \ 
2   3
   / \
  4   5
The minimum depth is 2.
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

public class E_155_Minimum_Depth_of_Binary_Tree {

    public static void main(String[] args) {

        int[] input = {1,2,4,5,3};
        int output = minDepth(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: The root of binary tree
     * @return: An integer
     */
    public static int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0) {
            return right + 1;
        } else if (right == 0) {
            return left + 1;
        } else {
            return Math.min(left, right) + 1;
        }
    }

}
