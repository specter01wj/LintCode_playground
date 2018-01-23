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
     * @return: True if this Binary tree is Balanced, or false.
     */
    bool isBalanced(TreeNode *root) {
        // write your code here
        if (root == NULL) return true;
        if (isCurtBalanced(root) && isBalanced(root->left) && isBalanced(root->right)) {
            return true;
        } else {
            return false;
        }
    }

private:
    bool isCurtBalanced(TreeNode *node) {
        if (node == NULL) return true;
        int left_depth = depth(node->left);
        int right_depth = depth(node->right);
        
        if ((left_depth - right_depth) <= 1 && (left_depth - right_depth) >= -1) {
            return true;
        } else {
            return false;
        }
    }
    
    int depth(TreeNode *node) {
        if (node == NULL) return 0;
        return max(depth(node->left), depth(node->right)) + 1;
    }
};