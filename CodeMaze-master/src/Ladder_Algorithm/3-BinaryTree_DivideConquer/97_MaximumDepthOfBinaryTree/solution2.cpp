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
    int maxDepth(TreeNode *root) {
        // write your code here
        if (root == NULL) return 0;
        
        int max_depth = 0;
        
        stack<TreeNode*> s = stack<TreeNode*>();
        s.push(root);
        
        while (!s.empty()) {
            vector<TreeNode*> v = vector<TreeNode*>();
            while(!s.empty()) {
                TreeNode *node = s.top();
                v.push_back(node);
                s.pop();
            }
            for (int i = 0; i != v.size(); ++i) {
                if (v[i]->left != NULL) s.push(v[i]->left);
                if (v[i]->right != NULL) s.push(v[i]->right);
            }
            ++max_depth;
        }
        
        return max_depth;
    }

};