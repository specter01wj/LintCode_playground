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
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    string serialize(TreeNode *root) {
        // write your code here
        vector<TreeNode*> v = vector<TreeNode*>();
    
    v.push_back(root);
    for (int i = 0; i < v.size(); ++i) {
        if (v[i] == NULL) continue;
        v.push_back(v[i]->left);
        v.push_back(v[i]->right);
    }
    
    while (!v.empty() && v[v.size()-1] == NULL) {
        v.pop_back();
    }
    
    if (v.size() == 0) return "{}";
    
    stringstream ss;
    
    ss << "{" << root->val;
    
    for (TreeNode *node : v) {
        if (node == NULL) ss << ",#";
        else if (node == root) continue;
        else ss << "," << node->val;
    }
    
    ss << "}";
    
    return ss.str();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    TreeNode *deserialize(string data) {
        // write your code here
        if (data == "{}") return NULL;
    
    vector<string> s_vec = sSplit(data.substr(1, data.size()-2), ",");
    
    int index = 0;
    
    TreeNode *root = new TreeNode(stoi(s_vec[index]));
    ++index;
    deque<TreeNode*> queue;
    queue.push_back(root);
    
    while (!queue.empty()) {
        int count = queue.size();
        for (int i = 0; i != count; ++i) {
            TreeNode *head = queue.front();
            if (index < s_vec.size()) {
                if (s_vec[index] == "#") {
                    head->left = NULL;
                } else {
                    TreeNode *leftNode = new TreeNode(stoi(s_vec[index]));
                    head->left = leftNode;
                    queue.push_back(leftNode);
                }
                ++index;
            }
            
            if (index < s_vec.size()) {
                if (s_vec[index] == "#") {
                    head->right = NULL;
                } else {
                    TreeNode *rightNode = new TreeNode(stoi(s_vec[index]));
                    head->right = rightNode;
                    queue.push_back(rightNode);
                }
                ++index;
            }
            queue.pop_front();
        }
    }
    return root;
    }
    
private:
    vector<string> sSplit(const string &s, string delim) {
        vector<string> result;
        int lastIndex = 0;
        int index = 0;
        while ((index = s.find(delim, lastIndex)) != string::npos) {
            result.push_back(s.substr(lastIndex, index-lastIndex));
            lastIndex = index + delim.size();
        }
        result.push_back(s.substr(lastIndex));
    
        return result;
    }
};