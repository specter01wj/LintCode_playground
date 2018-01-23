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
        stack<TreeNode*> s = stack<TreeNode*>();
        
        if (root == NULL) return result;
        
        TreeNode *node = root;
        
        while (node != NULL || !s.empty()) {

            while (node != NULL) {
                s.push(node);
                node = node->left;
            }
            
            node = s.top();
            s.pop();
            
            result.push_back(node->val);
            node = node->right;
        }
    }
};