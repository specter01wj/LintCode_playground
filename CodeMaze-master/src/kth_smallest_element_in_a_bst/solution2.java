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
    private int count;
    private int res;
    
    public int kthSmallest(TreeNode root, int k) {
        res = Integer.MIN_VALUE;
        traverse(root, k);
        return res;
    }
    
    private void traverse(TreeNode node, int k) {
        if (node == null) return;
        traverse(node.left, k);
        if (++count == k) res = node.val;
        traverse(node.right, k);
    }
}