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
        
        if (root == NULL) return result;
        
        stack<TreeNode*> s = stack<TreeNode*>();
        
        s.push(root);
        while (!s.empty()) {
            
            TreeNode *node = s.top();
            s.pop();

            if (node != NULL) result.push_back(node->val);
            
            if (node->right != NULL) s.push(node->right);
            if (node->left != NULL) s.push(node->left);
            
        }
        
        return result;
    }
};