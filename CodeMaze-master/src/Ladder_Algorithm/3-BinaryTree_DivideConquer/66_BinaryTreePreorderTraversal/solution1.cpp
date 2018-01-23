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
     * @return: Preorder in vector which contains node values.
     */
    vector<int> preorderTraversal(TreeNode *root) {
        // write your code here
        vector<int> result = vector<int>();
        
        helper(root, result);
        
        return result;
    }
    
    void helper(TreeNode *root, vector<int> &result) {
        if (root == NULL) return;
        
        result.push_back(root->val);
        
        helper(root->left, result);
        helper(root->right, result);
    }
};
