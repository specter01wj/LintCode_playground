/*
Find the sum of all left leaves in a given binary tree.

Example
    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
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

public class E_1254_Sum_of_Left_Leaves {

    public static void main(String[] args) {

        int[] input = {3,9,20,#,#,15,7};
        int output = sumOfLeftLeaves(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param root: t
     * @return: the sum of all left leaves
     */
    public static int sumOfLeftLeaves(TreeNode root) {
        // Write your code here
        if(root == null) {
            return 0;
        }

        int sum = 0;

        if(root.left != null) {
            TreeNode left = root.left;
            if(left.left == null && left.right == null) {
                sum += left.val;
            }
            else {
                sum += sumOfLeftLeaves(left);
            }
        }

        if(root.right != null) {
            TreeNode right = root.right;
            sum += sumOfLeftLeaves(right);
        }
        
        return sum;
    }

}
