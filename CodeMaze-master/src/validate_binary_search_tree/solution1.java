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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    // long min and long max is for root.val == Integer.MAX_VALUE
    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min) return false;
        if (root.val >= max) return false;
        
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}