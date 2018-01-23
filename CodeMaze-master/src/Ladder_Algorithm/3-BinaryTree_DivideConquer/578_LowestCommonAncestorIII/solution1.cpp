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
     * @param root: The root of the binary tree.
     * @param A and B: two nodes
     * @return: Return the LCA of the two nodes.
     */
    TreeNode *lowestCommonAncestor3(TreeNode* root, TreeNode* A, TreeNode* B) {
        // write your code here
        
        TreeNode *node = NULL;
        
        if (is_found(root, A) && is_found(root, B)) {
            node = helper(root, A, B);
        }
        
        return node;
    }
private:
    TreeNode* helper(TreeNode* root, TreeNode* A, TreeNode* B) {
        if (root == NULL || root == A || root == B) return root;
        
        TreeNode *left = helper(root->left, A, B);
        TreeNode *right = helper(root->right, A, B);
        
        if (left != NULL && right != NULL) return root;
        if (left != NULL) return left;
        if (right != NULL) return right;
    }
    
    bool is_found(TreeNode *root, TreeNode *target) {
        if (root == NULL || target == NULL) return false;
        
        if (root == target || is_found(root->left, target) || is_found(root->right, target)) {
            return true;
        }
        
        return false;
    }
};