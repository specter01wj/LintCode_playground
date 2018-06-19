/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

Example
For example, this binary tree {1,2,2,3,4,4,3} is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following {1,2,2,#,3,#,3} is not:

    1
   / \
  2   2
   \   \
   3    3
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

public class E_1360_Symmetric_Tree {

    public static void main(String[] args) {

        int[] input = {1,2,2,#,3,#,3};
        boolean output = isSymmetric(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param root: root of the given tree
     * @return: whether it is a mirror of itself 
     */
    public static boolean isSymmetric(TreeNode root) {
        // Write your code here
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.offer(root);
        TreeNode current;
        int size;
        boolean isSymmetric;
        while (!queue.isEmpty()){
            size = queue.size();
            for (int i = 0; i < size; i ++){
                current = queue.poll();
                if (current != null){
                    queue.offer(current.left);
                    queue.offer(current.right);
                }
                if (size == 1){
                    break;
                }
                if (size % 2 != 0){
                    return false;
                }
                if (i < size / 2){
                    stack.push(current);
                } else {
                    isSymmetric = current == null 
                        ? current == stack.pop()
                        : current.val == stack.pop().val;
                    if (!isSymmetric){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
