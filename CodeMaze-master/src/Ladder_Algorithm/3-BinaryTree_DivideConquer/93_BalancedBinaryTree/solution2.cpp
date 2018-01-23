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
    bool isBalanced;
    int maxDepth;
    ResultType(bool isBalanced, int maxDepth) {
        this->isBalanced = isBalanced;
        this->maxDepth = maxDepth;
    }
};

class Solution {
public:
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    bool isBalanced(TreeNode *root) {
        // write your code here
        return helper(root)->isBalanced;
    }

private:
    ResultType* helper(TreeNode *node) {
        if (node == NULL) {
            return new ResultType(true, 0);
        }
        ResultType *left = helper(node->left);
        ResultType *right = helper(node->right);

        if (!left->isBalanced || !right->isBalanced) {
            return new ResultType(false, INT_MIN);
        }

        if (abs(left->maxDepth - right->maxDepth) > 1) {
            return new ResultType(false, INT_MIN);
        }

        return new ResultType(true, max(left->maxDepth, right->maxDepth) + 1);

        /* or
        if (left->isBalanced && right->isBalanced && abs(left->maxDepth - right->maxDepth) <= 1) {
            int h = max(left->maxDepth, right->maxDepth) + 1;
            return new ResultType(true, h);
        } else {
            return new ResultType(false, 0);
        }
        */

    }

};