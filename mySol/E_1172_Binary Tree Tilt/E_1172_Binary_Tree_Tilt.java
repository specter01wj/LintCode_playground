/*
Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

 Notice
1.The sum of node values in any subtree won't exceed the range of 32-bit integer.
2.All the tilt values won't exceed the range of 32-bit integer.

Example
Input: 
         1
       /   \
      2     3
Output: 1
Explanation: 
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1
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

public class E_1172_Binary_Tree_Tilt {

    public static void main(String[] args) {

        int[] input = {1,2,3};
        int output = findTilt(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param root: the root
     * @return: the tilt of the whole tree
     */
    public static int findTilt(TreeNode root) {
        // Write your code here
        int[] res = new int[1];
        countTilt(root, res);
        return res[0];
    }
    
    private int countTilt(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }
        
        int left = countTilt(root.left, res);
        int right = countTilt(root.right, res);
        res[0] += Math.abs(right - left);
        return root.val + left + right;
    }

}
