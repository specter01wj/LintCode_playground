/*
Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

 Notice
Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.

Example
Given root = {1}, target = 4.428571, return 1.
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

public class E_900_Closest_Binary_Search_Tree_Value {

    public static void main(String[] args) {

        int[] input = {1};
        int output = closestValue(input, 4.428571);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param root: the given BST
     * @param target: the given target
     * @return: the value in the BST that is closest to the target
     */
    public static int closestValue(TreeNode root, double target) {
        // write your code here
        if (root == null) {
            return 0;
        }
        
        TreeNode lowerNode = lowerBound(root, target);
        TreeNode upperNode = upperBound(root, target);
        
        if (lowerNode == null) {
            return upperNode.val;
        }
        
        if (upperNode == null) {
            return lowerNode.val;
        }
        
        if (target - lowerNode.val > upperNode.val - target) {
            return upperNode.val;
        }
        
        return lowerNode.val;
    }
    
    // find the node with the largest value that smaller than target
    private TreeNode lowerBound(TreeNode root, double target) {
        if (root == null) {
            return null;
        }
        
        if (target <= root.val) {
            return lowerBound(root.left, target);
        }
        
        // root.val < target
        TreeNode lowerNode = lowerBound(root.right, target);
        if (lowerNode != null) {
            return lowerNode;
        }
        
        return root;
    }
    
    // find the node with the smallest value that larger than or equal to target
    private TreeNode upperBound(TreeNode root, double target) {
        if (root == null) {
            return null;
        }
        
        if (root.val < target) {
            return upperBound(root.right, target);
        }
        
        // root.val >= target
        TreeNode upperNode = upperBound(root.left, target);
        if (upperNode != null) {
            return upperNode;
        }
        
        return root;
    }

}
