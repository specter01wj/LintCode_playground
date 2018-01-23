/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            // in right sub tree, find the k - count - 1 smallest node, 
            // 1 represents current node
            return kthSmallest(root.right, k - count - 1);
        } else {
            // k == count + 1, means current node
            return root.val;
        }
    }
    
    private int countNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}