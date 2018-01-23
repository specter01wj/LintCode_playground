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
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> results = vector<string>();
        
        if (root != NULL) {
            string s = to_string(root->val);
            helper(root, results, s);
        }
        
        return results;
    }
private:
    void helper(TreeNode* node, vector<string> &results, string s) {
        if (node->left == NULL && node->right == NULL) {
            results.push_back(s);
            return;
        }
        
        if (node->left != NULL) helper(node->left, results, s+"->"+to_string(node->left->val));
        if (node->right != NULL) helper(node->right, results, s+"->"+to_string(node->right->val));
    }
};