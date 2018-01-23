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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    private TreeNode construct(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; ++i) {
            if (inorder[i] == root.val) {
                rootIndex = i;
            }
        }
        
        root.left = construct(preStart + 1, inStart, rootIndex - 1, preorder, inorder);
        root.right = construct(preStart + rootIndex - inStart + 1, rootIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}