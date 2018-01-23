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
        
        int min_depth = 0;
        
        if (root == NULL) return min_depth;
        
        stack<TreeNode*> s = stack<TreeNode*>();
        
        s.push(root);
        
        while (!s.empty()) {
            vector<TreeNode*> v = vector<TreeNode*>();
            ++min_depth;
            
            while (!s.empty()) {
                TreeNode *node = s.top();
                if (node->left == NULL && node->right == NULL) return min_depth;
                v.push_back(node);
                s.pop();
            }
            
            for(TreeNode *node : v) {
                if (node->left != NULL) s.push(node->left);
                if (node->right != NULL) s.push(node->right);
            }
            
        }
    }
};