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
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in vector which contains node values.
     */
public:
    vector<int> inorderTraversal(TreeNode *root) {
        // write your code here
        vector<int> result = vector<int>();
        
        helper(root, result);
        
        return result;
    }
    
    void helper(TreeNode *root, vector<int> &result) {
        if (root == NULL) return;
        
        if (root->left != NULL) helper(root->left, result);
        result.push_back(root->val);
        if (root->right != NULL) helper(root->right, result);
    }
};