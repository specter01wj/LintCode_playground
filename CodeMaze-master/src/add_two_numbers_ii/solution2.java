/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        
        while (l1 != null) {
            s1.push(l1);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            s2.push(l2);
            l2 = l2.next;
        }
        
        int carry = 0;
        int sum = 0;
        ListNode head = null;
        ListNode node = null;
        
        while (!s1.empty() || !s2.empty() || carry == 1) {
            if (!s1.empty() && !s2.empty()) {
                sum = s1.pop().val + s2.pop().val + carry;
                if (sum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            } else if (s1.empty() && !s2.empty()) {
                sum = s2.pop().val + carry;
                if (sum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            } else if (s2.empty() && !s1.empty()) {
                sum = s1.pop().val + carry;
                if (sum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            } else {
                sum = 1;
                carry = 0;
            }
            
            head = new ListNode(sum % 10);
            head.next = node;
            node = head;
        }
        
        return head;
    }
}