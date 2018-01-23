/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    private Map<Integer, UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        map = new HashMap<>();
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        clone(newNode, node);
        
        return newNode;
    }
    
    private void clone(UndirectedGraphNode newNode, UndirectedGraphNode node) {
        map.put(newNode.label, newNode);
        
        for (UndirectedGraphNode neighbor : node.neighbors) {
            UndirectedGraphNode newNeighbor;
            if (map.containsKey(neighbor.label)) {
                newNeighbor = map.get(neighbor.label);
            } else {
                newNeighbor = new UndirectedGraphNode(neighbor.label);
                clone(newNeighbor, neighbor);
            }

            newNode.neighbors.add(newNeighbor);
        }
    }
}