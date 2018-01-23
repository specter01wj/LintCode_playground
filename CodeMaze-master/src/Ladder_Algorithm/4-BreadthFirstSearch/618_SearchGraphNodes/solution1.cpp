/**
 * Definition for Undirected graph.
 * struct UndirectedGraphNode {
 *     int label;
 *     vector<UndirectedGraphNode *> neighbors;
 *     UndirectedGraphNode(int x) : label(x) {};
 * };
 */
class Solution {
public:
    /**
     * @param graph a list of Undirected graph node
     * @param values a hash mapping, <UndirectedGraphNode, (int)value>
     * @param node an Undirected graph node
     * @param target an integer
     * @return the a node
     */
    UndirectedGraphNode* searchNode(vector<UndirectedGraphNode*>& graph,
                                    map<UndirectedGraphNode*, int>& values,
                                    UndirectedGraphNode* node,
                                    int target) {
        // Write your code here
        if (node == NULL) return NULL;
        deque<UndirectedGraphNode*> queue = deque<UndirectedGraphNode*>();
        set<UndirectedGraphNode*> hash_set = set<UndirectedGraphNode*>();
        
        queue.push_back(node);
        hash_set.insert(node);
        
        while (!queue.empty()) {
            UndirectedGraphNode *head = queue.front();
            queue.pop_front();
            
            if (values[head] == target) return head;
            
            for (UndirectedGraphNode *neighbor : head->neighbors) {
                if (hash_set.find(neighbor) == hash_set.end()) {
                    queue.push_back(neighbor);
                    hash_set.insert(neighbor);
                }
            }
        }
        
        return NULL;
    }
};