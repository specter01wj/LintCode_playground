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
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    vector<vector<int>> binaryTreePathSum(TreeNode *root, int target) {
        // Write your code here
        vector<vector<int>> results = vector<vector<int>>();
        if (root == NULL) return results;
        vector<int> path = vector<int>();
        path.push_back(root->val);
        helper(root, target, path, results);
        
        return results;
    }
private:
    void helper(TreeNode* root, int target, vector<int> path, vector<vector<int>> &results) {
        
        if (root->left == NULL && root->right == NULL) {
            int sum = 0;
            for (int i : path) {
                sum += i;
            }
            
            if (sum == target) {
                results.push_back(path);
            }
            return;
        }
        
        if (root->left != NULL) {
            path.push_back(root->left->val);
            helper(root->left, target, path, results);
            path.pop_back();
        }
        if (root->right != NULL) {
            path.push_back(root->right->val);
            helper(root->right, target, path, results);
            path.pop_back();
        }
    }
};