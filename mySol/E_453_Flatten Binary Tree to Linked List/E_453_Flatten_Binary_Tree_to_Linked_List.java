/*
Flatten a binary tree to a fake "linked list" in pre-order traversal.

Here we use the right pointer in TreeNode as the next pointer in ListNode.

 Notice
Don't forget to mark the left child of each node to null. Or you will get Time Limit Exceeded or Memory Limit Exceeded.

Example
              1
               \
     1          2
    / \          \
   2   5    =>    3
  / \   \          \
 3   4   6          4
                     \
                      5
                       \
                        6
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

public class E_453_Flatten_Binary_Tree_to_Linked_List {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6};
        int output = flatten(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: a TreeNode, the root of the binary tree
     * @return: 
     */
    public static void flatten(TreeNode root) {
        // write your code here
        if (root == null || root.left == null && root.right == null) {
            return;
        }

        if (root.left != null) {
            flatten(root.left);
            TreeNode tmpRight = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode t = root.right;
            while (t.right != null) {
                t = t.right;
            }
            t.right = tmpRight;
        }
        flatten(root.right);
    }

}
