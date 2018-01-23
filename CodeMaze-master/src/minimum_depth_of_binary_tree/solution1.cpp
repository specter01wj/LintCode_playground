/**
 * Definition of TreeNode:
 * class TreeNode {
 * public:
 *     int val;
 *     TreeNode *left, *right;
 *     TreeNode(int val) {
 *         this->val = val;
 *         this->left = this->right = NULL;
 *     }
 * }
 */
class Solution {
public:
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    int minDepth(TreeNode *root) {
        // write your code here
        if (root == NULL) return 0;
        return helper(root);
        
    }
private:
    int helper(TreeNode *root) {
        if (root == NULL) return INT_MAX;
        if (root->right == NULL && root->left == NULL) return 1;
        
        int minLeft = helper(root->left);
        int minRight = helper(root->right);
        
        return min(minLeft, minRight) + 1;
    }
};