/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left, *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    /**
     * @param root the root of binary tree
     * @return the length of the longest consecutive sequence path
     */
    int longestConsecutive(TreeNode* root) {
        // Write your code here
        return helper(root, NULL, 0);
    }
private:
    int helper(TreeNode* root, TreeNode* parent, int lengthWithoutRoot) {
        if (root == NULL) return 0;
        
        int length = (parent != NULL && parent->val + 1 == root->val) ? lengthWithoutRoot + 1 : 1;
        
        int left = helper(root->left, root, length);
        int right = helper(root->right, root, length);
        
        return max(length, max(left, right));
    }
};