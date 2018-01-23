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
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    TreeNode *lowestCommonAncestor(TreeNode *root, TreeNode *A, TreeNode *B) {
        // write your code here
        
        if (root == NULL || A == root || B == root) return root;
        
        vector<TreeNode*> A_path = vector<TreeNode*>();
        vector<TreeNode*> B_path = vector<TreeNode*>();
        
        preorder_find(root, A, A_path);
        reverse(A_path.begin(), A_path.end());
        
        preorder_find(root, B, B_path);
        reverse(B_path.begin(), B_path.end());
        
        int min_size = min(A_path.size(), B_path.size());
        int i;
        
        for(i = 0; i != min_size; ++i) {
            if (A_path[i] != B_path[i]) break;
        }
        
        return A_path[i-1];
        
    }
private:
    bool preorder_find(TreeNode *root, TreeNode *dest, vector<TreeNode*> &path) {
        if (root == NULL) return false;
        
        if (root == dest || preorder_find(root->left, dest, path) || preorder_find(root->right, dest, path)) {
            path.push_back(root);
            return true;
        }
        
        return false;
        
    }
};