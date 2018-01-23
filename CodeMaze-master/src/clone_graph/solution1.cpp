/**
 * Definition for undirected graph.
 * struct UndirectedGraphNode {
 *     int label;
 *     vector<UndirectedGraphNode *> neighbors;
 *     UndirectedGraphNode(int x) : label(x) {};
 * };
 */
class Solution {
public:
    /**
     * @param node: A undirected graph node
     * @return: A undirected graph node
     */
    UndirectedGraphNode *cloneGraph(UndirectedGraphNode *node) {
        // write your code here
        if (node == NULL) return NULL;
        map<int, UndirectedGraphNode*> hash_map = map<int, UndirectedGraphNode*>();
        return clone(node, hash_map);
    }
private:
    UndirectedGraphNode* clone(UndirectedGraphNode *node, 
                                map<int, UndirectedGraphNode*> &hash_map) {
        if (node == NULL) return NULL;
        if (hash_map.find(node->label) != hash_map.end()) {
            return hash_map[node->label];
        }
        
        UndirectedGraphNode *newNode = new UndirectedGraphNode(node->label);
        hash_map[node->label] = newNode;
        
        for (UndirectedGraphNode *neighbor : node->neighbors) {
            UndirectedGraphNode *newNeighbor = clone(neighbor, hash_map);
            newNode->neighbors.push_back(newNeighbor);
        }
        
        return newNode;
    }
};