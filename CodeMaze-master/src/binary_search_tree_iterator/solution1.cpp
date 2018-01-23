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
 * Example of iterate a tree:
 * BSTIterator iterator = BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode * node = iterator.next();
 *    do something for node
 */
class BSTIterator {
public:
    //@param root: The root of binary tree.
    BSTIterator(TreeNode *root) {
        // write your code here
        if (root == NULL) this->vt = vector<TreeNode*>();
        else {
            stack<TreeNode*> st;
            
            while (root != NULL || !st.empty()) {
                while (root != NULL) {
                    st.push(root);
                    root = root->left;
                }
                root = st.top();
                this->vt.push_back(root);
                st.pop();
                root = root->right;
            }
        }
        this->curt_pos = -1;
    }

    //@return: True if there has next node, or false
    bool hasNext() {
        // write your code here
        if (curt_pos + 1 < vt.size()) return true;
        else return false;
    }
    
    //@return: return next node
    TreeNode* next() {
        // write your code here
        if (curt_pos + 1 < vt.size()) {
            return vt[++curt_pos];
        } else {
            return NULL;
        }
    }
private:
    vector<TreeNode*> vt;
    int curt_pos;
};