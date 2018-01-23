/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode n1 = headA;
        ListNode n2 = headB;
        
        while (n1 != null) {
            set.add(n1);
            n1 = n1.next;
        }
        
        while (n2 != null) {
            if (set.contains(n2)) return n2;
            n2 = n2.next;
        }
        
        return null;
    }
}