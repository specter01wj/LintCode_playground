/*
Given a binary tree, find all paths that sum of the nodes in the path equals to a given number target.

A valid path is from root node to any of the leaf nodes.

Example
Given a binary tree, and target = 5:

     1
    / \
   2   4
  / \
 2   3
return

[
  [1, 2, 2],
  [1, 4]
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

public class E_376_Binary_Tree_Path_Sum {

    public static void main(String[] args) {

        int[] input = {1,2,2,3,4};
        List output = binaryTreePathSum(input, 5);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public static List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;
        LinkedList<Integer> buffer = new LinkedList<>();
        buffer.add(root.val);
        search(result, buffer, root, target);
        return result;
    }
    
    private void search(List<List<Integer>> result, LinkedList<Integer> buffer, TreeNode node, int target) {
        if (node.left == null && node.right == null) {
            int sum = 0;
            for (int i : buffer) {
                sum += i;
            }
            if (sum == target) {
                result.add(new ArrayList<Integer>(buffer));
            }
            return;
        }

        if (node.left != null) {

            buffer.add(node.left.val);
            search(result, buffer, node.left, target);
            buffer.removeLast();
        }

        if (node.right != null) {

            buffer.add(node.right.val);
            search(result, buffer, node.right, target);
            buffer.removeLast();
        }
    }

}
