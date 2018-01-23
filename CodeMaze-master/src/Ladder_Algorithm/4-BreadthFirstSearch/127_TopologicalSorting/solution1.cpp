/**
 * Definition for Directed graph.
 * struct DirectedGraphNode {
 *     int label;
 *     vector<DirectedGraphNode *> neighbors;
 *     DirectedGraphNode(int x) : label(x) {};
 * };
 */
class Solution {
public:
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    vector<DirectedGraphNode*> topSort(vector<DirectedGraphNode*> graph) {
        // write your code here
        vector<DirectedGraphNode*> results = vector<DirectedGraphNode*>();
        if (graph.size() == 0) return results;
        
        unordered_map<DirectedGraphNode*, int> in_map;
        cal_inMap(graph, in_map);
        for (DirectedGraphNode *node : graph) {
            if (in_map[node] == 0) {
                dfs(in_map, node, results);
                // break;
            }
        }
        
        return results;
    }
private:
    void dfs(unordered_map<DirectedGraphNode*, int> &in_map, 
             DirectedGraphNode *node,
             vector<DirectedGraphNode*> &results) {
        results.push_back(node);
        in_map[node]--;
        for(DirectedGraphNode *neighbor : node->neighbors) {
            in_map[neighbor]--;
            if (in_map[neighbor] == 0) {
                dfs(in_map, neighbor, results);
            }
        }
    }
    void cal_inMap(vector<DirectedGraphNode*> graph, 
                   unordered_map<DirectedGraphNode*, int> &in_map) {
        for (DirectedGraphNode *node : graph) {
            for (DirectedGraphNode *neighbor : node->neighbors) {
                if (in_map.find(neighbor) == in_map.end()) {
                    in_map[neighbor] = 1;
                } else {
                    in_map[neighbor] += 1;
                }
            }
        }
    }
};