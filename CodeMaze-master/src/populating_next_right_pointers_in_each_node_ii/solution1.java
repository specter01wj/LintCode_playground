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
        TreeLinkNode finder = root;
        TreeLinkNode linker = finder;
        
        while (finder != null) {
            TreeLinkNode dummy = new TreeLinkNode(0);
            linker = dummy;
            while (finder != null) {
                if (finder.left != null) {
                    linker.next = finder.left;
                    linker = linker.next;
                }
            
                if (finder.right != null) {
                    linker.next = finder.right;
                    linker = linker.next;
                }
                finder = finder.next;
            }
            
            finder = dummy.next;
        }
    }
}