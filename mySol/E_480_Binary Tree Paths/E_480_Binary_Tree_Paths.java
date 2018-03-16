/*
Given a binary tree, return all root-to-leaf paths.

Example
Given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

[
  "1->2->5",
  "1->3"
]
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

public class E_480_Binary_Tree_Paths {

    public static void main(String[] args) {

        int[] input = {1,2,3,#,5};
        List<String> output = binaryTreePaths(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        List<String> result = new ArrayList<>();
        search(root, null, result);
        return result;
    }
    
    private void search(TreeNode root, String prefix, List<String> result) {
        if (root == null) {
            return;
        }

        String s = (prefix == null ? root.val + "" : prefix + "->" + root.val);

        if (root.left == null && root.right == null) {
            result.add(s);
            return;
        }

        if (root.left != null) {
            search(root.left, s, result);
        }

        if (root.right != null) {
            search(root.right, s, result);
        }

        return;
    }

}
