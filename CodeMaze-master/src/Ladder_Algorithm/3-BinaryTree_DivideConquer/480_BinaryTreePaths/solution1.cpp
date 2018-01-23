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
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    vector<string> binaryTreePaths(TreeNode* root) {
        // Write your code here
        
        vector<string> results = vector<string>();
        if (root == NULL) return results;
        
        vector<TreeNode*> leaf_v = vector<TreeNode*>();
        
        stack<TreeNode*> s = stack<TreeNode*>();
        s.push(root);
        
        while (!s.empty()) {
            
            TreeNode* node = s.top();
            s.pop();
            
            if (node->left == NULL && node->right == NULL) leaf_v.push_back(node);
            if (node->right != NULL) s.push(node->right);
            if (node->left != NULL) s.push(node->left);
        }
        
        
        for (TreeNode* leaf : leaf_v) {
            
            vector<TreeNode*> path = vector<TreeNode*>();
            preorder_find(root, leaf, path);
            reverse(path.begin(), path.end());
            
            string path_string = to_string(root->val);
            
            if (path.size() > 1) {
            
                for (int i = 1; i != path.size(); ++i) {
                    path_string += "->" + to_string(path[i]->val);
                }
            }
            
            
            results.push_back(path_string);
        }
        
        return results;
    }
private:
    bool preorder_find(TreeNode* root, TreeNode* dest, vector<TreeNode*> &path) {
        if (root == NULL) return false;
        
        if (root == dest || preorder_find(root->left, dest, path) || preorder_find(root->right, dest, path)) {
            path.push_back(root);
            return true;
        }
        
        return false;
    }
};