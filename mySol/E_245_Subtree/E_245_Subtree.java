/*
You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.

 Notice
A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2. That is, if you cut off the tree at node n, the two trees would be identical.

Example
T2 is a subtree of T1 in the following case:

       1                3
      / \              / 
T1 = 2   3      T2 =  4
        /
       4
T2 isn't a subtree of T1 in the following case:

       1               3
      / \               \
T1 = 2   3       T2 =    4
        /
       4
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

public class E_245_Subtree {

    public static void main(String[] args) {

        int[] input1 = {1,2,#,3,4,#};
        int[] input2 = {3,4};
        boolean output = isSubtree(input1, input2);
        System.out.println("input1: " + Arrays.toString(input1) + " input2: " + Arrays.toString(input2) + "\noutput: " + output);

    }

    /*
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public static boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if (T2 == null) {
            return true;
        }

        if (T1 == null) {
            return false;
        }

        return same(T1, T2) || isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
    }
    
    private boolean same(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) return true;
        if (T1 == null || T2 == null || T1.val != T2.val) return false;
        return same(T1.left, T2.left) && same(T1.right, T2.right);
    }

}
