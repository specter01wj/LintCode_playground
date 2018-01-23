/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode startNode = root;
        TreeLinkNode node;
        
        while (startNode != null) {
            node = startNode;
            while (node != null) {
                if (node.left != null) {
                    node.left.next = node.right;
                }
                if (node.next != null && node.right != null) {
                    node.right.next = node.next.left;
                }
                
                node = node.next;
            }
            startNode = startNode.left;
        }
        
    }
}