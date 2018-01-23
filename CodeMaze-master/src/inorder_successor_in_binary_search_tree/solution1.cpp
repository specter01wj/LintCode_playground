/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* inorderSuccessor(TreeNode* root, TreeNode* p) {
        // write your code here
        if (root == NULL) return NULL;
        
        stack<TreeNode*> s;
        bool found = false;
        
        while (root != NULL || !s.empty()) {
            while (root != NULL) {
                s.push(root);
                root = root->left;
            }
            root = s.top();
            if (found) {
                return root;
            }
            if (p->val == root->val) {
                found = true;
            }
            s.pop();
            root = root->right;
        }
        return NULL;
    }
};