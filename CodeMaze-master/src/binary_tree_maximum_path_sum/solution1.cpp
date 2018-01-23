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
class ResultType {
public:
    int singlePath, maxPath;
    ResultType(int singlePath, int maxPath) {
        this->singlePath = singlePath;
        this->maxPath = maxPath;
    }
};

class Solution {
public:
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    int maxPathSum(TreeNode *root) {
        // write your code here
        ResultType *result = helper(root);
        return result->maxPath;
    }
private:
    ResultType* helper(TreeNode *node) {
        if (node == NULL) return new ResultType(0, INT_MIN);
        
        ResultType *left = helper(node->left);
        ResultType *right = helper(node->right);
        
        int sp = max(left->singlePath, right->singlePath) + node->val;
        sp = max(sp, 0);
        int mp = max(left->maxPath, right->maxPath);
        mp = max(mp, (left->singlePath + right->singlePath + node->val));
        
        return new ResultType(sp, mp);
    }
};