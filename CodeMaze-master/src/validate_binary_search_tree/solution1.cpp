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
    bool isValid;
    int minValue;
    int maxValue;
    
    ResultType(bool isValid, int minValue, int maxValue) {
        this->isValid  = isValid;
        this->minValue = minValue;
        this->maxValue = maxValue;
    }
};

class Solution {
public:
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    bool isValidBST(TreeNode *root) {
        // write your code here
        ResultType* result = helper(root);
        
        return result->isValid;
        
    }
    
    ResultType* helper(TreeNode *curt) {
        if (curt == NULL) return new ResultType(true, INT_MAX, INT_MIN);
        if (curt->left == NULL && curt->right == NULL) return new ResultType(true, curt->val, curt->val);
        ResultType *left = helper(curt->left);
        ResultType *right = helper(curt->right);
        
        if (!left->isValid || !right->isValid) {
            return new ResultType(false, 0, 0);
        }
        
        if ((curt->left != NULL && curt->val <= left->maxValue) || (curt->right != NULL && curt->val >= right->minValue)) {
            return new ResultType(false, 0, 0);
        }
        
        return new ResultType(true, min(left->minValue, curt->val), max(right->maxValue, curt->val));
    }
};