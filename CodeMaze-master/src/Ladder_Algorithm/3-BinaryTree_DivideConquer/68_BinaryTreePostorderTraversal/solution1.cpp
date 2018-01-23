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
     * @return: Postorder in vector which contains node values.
     */
public:
    vector<int> postorderTraversal(TreeNode *root) {
        // write your code here
        vector<int> result = vector<int>();
        
        if (root == NULL) return result;
        
        helper(root, result);
        
        return result;
    }
    
    void helper(TreeNode *node, vector<int> &result) {
        if (node == NULL) return;
        
        helper(node->left, result);
        helper(node->right, result);
        result.push_back(node->val);
    }
};