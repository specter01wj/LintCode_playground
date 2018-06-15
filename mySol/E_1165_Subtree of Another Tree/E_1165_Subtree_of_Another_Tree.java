/*
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example
Example 1:

Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:

Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
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

public class E_1165_Subtree_of_Another_Tree {

    public static void main(String[] args) {

        int[] input1 = {3,4,5,1,2}, input2 = {4,1,2};
        boolean output = isSubtree(input1, input2);
        System.out.println("input1: " + Arrays.toString(input1) + 
                        "input2: " + Arrays.toString(input2) + "\noutput: " + output);

    }

    /**
     * @param s: the s' root
     * @param t: the t' root
     * @return: whether tree t has exactly the same structure and node values with a subtree of s
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // Write your code here
        if (s == null) {
            return t == null;
        }
        
        if (s.val == t.val && isSametree(s, t)){
            return true;
        }

        return isSubtree(s.left, t) | isSubtree(s.right, t);
    }
    
    private boolean isSametree(TreeNode s, TreeNode t) {
        if (s == null){
            return t == null;
        }
        if (t == null){
            return false;
        }
        
        if (s.val != t.val){
            return false;
        }
        
        return isSametree(s.left, t.left) & isSametree(s.right, t.right);
    }

}
