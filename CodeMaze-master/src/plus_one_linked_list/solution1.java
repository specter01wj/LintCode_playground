/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        Stack<ListNode> s = new Stack<>();
        while (head != null) {
            s.push(head);
            head = head.next;
        }
        int add1 = 1;
        while (!s.isEmpty() && add1 == 1) {
            ListNode node = s.peek();
            s.pop();
            if (node.val == 9) {
                node.val = 0;
                add1 = 1;
            } else {
                node.val += 1;
                add1 = 0;
            }
        }
        
        if (add1 == 1) {
            ListNode node = new ListNode(1);
            node.next = dummy.next;
            dummy.next = node;
        }
        
        return dummy.next;
    }
}