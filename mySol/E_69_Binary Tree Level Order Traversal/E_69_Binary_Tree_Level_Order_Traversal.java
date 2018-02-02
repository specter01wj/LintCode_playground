/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

Example
Given binary tree {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7
 

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
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

public class E_69_Binary_Tree_Level_Order_Traversal {

    public static void main(String[] args) {

        int[] input = {3,9,20,#,#,15,7};
        int[] output = levelOrder(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if (root == null) {
           return rst; 
        }  
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> backQueue = new LinkedList<TreeNode>();
        queue.offer(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                backQueue.offer(node.left);
            }
            if (node.right != null) {
                backQueue.offer(node.right);
            }
            list.add(node.val);
            
            if (queue.isEmpty()) {
                rst.add(new ArrayList<Integer>(list));
                list = new ArrayList<Integer>();
                queue = backQueue;
                backQueue = new LinkedList<TreeNode>();
            }
        
        }
        return rst;
    }

}
