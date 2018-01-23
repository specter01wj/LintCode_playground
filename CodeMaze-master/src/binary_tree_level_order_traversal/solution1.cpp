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
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
public:
    vector<vector<int>> levelOrder(TreeNode *root) {
        // write your code here
        vector<vector<int>> result = vector<vector<int>>();
        
        if (root == NULL) return result;
        
        vector<int> curt_level = vector<int>();
        deque<TreeNode*> dq = deque<TreeNode*>();

        dq.push_back(root);
        
        while (!dq.empty()) {
            int size = dq.size();
            curt_level.clear();
            for (int i = 0; i != size; ++i) {
                TreeNode *node = dq.front();
                curt_level.push_back(node->val);
                if (node->left != NULL) dq.push_back(node->left);
                if (node->right != NULL) dq.push_back(node->right);
                dq.pop_front();
            }
            result.push_back(curt_level);
        }
        
        return result;
    }
};