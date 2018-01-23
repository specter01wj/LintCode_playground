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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    void flatten(TreeNode *root) {
        // write your code here
        vector<TreeNode*> result = vector<TreeNode*>();
        
        helper(root, result);
        
        if (result.size() > 1) {
            for (int i = 0; i != result.size() - 1; ++i) {
                result[i]->left = NULL;
                result[i]->right = result[i+1];
            }
            
            result[result.size()-1]->left = NULL;
            result[result.size()-1]->right = NULL;
        }
        
        return;
    }
    
private:
    void helper(TreeNode *node, vector<TreeNode*> &result) {
        if (node == NULL) return;
        
        result.push_back(node);
        if (node->left != NULL) helper(node->left, result);
        if (node->right != NULL) helper(node->right, result);
    }
};