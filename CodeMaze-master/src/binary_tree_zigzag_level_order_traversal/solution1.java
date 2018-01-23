/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if (root == null) return res;
        
        
        Deque<TreeNode> deque = new LinkedList<>();
        boolean leftToRight = true;
        deque.offerLast(root);
        
        while (!deque.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int size = deque.size();
            for (int i = 0; i < size; ++i) {
                if (leftToRight) {
                    TreeNode node = deque.pollFirst();
                    if (node.left != null) deque.offerLast(node.left);
                    if (node.right != null) deque.offerLast(node.right);
                    levelList.add(node.val);
                } else {
                    TreeNode node = deque.pollLast();
                    if (node.right != null) deque.offerFirst(node.right);
                    if (node.left != null) deque.offerFirst(node.left);
                    levelList.add(node.val);
                }
            }
            
            res.add(levelList);
            leftToRight = !leftToRight;
        }
        
        return res;
    }
}