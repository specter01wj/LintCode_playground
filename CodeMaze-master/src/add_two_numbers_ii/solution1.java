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
        Stack<ListNode> s = new Stack<>();
        
        while (l1 != null) {
            s1.push(l1);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            s2.push(l2);
            l2 = l2.next;
        }
        
        int tmp = 0;
        int sum = 0;
        
        while (!s1.empty() || !s2.empty() || tmp == 1) {
            if (!s1.empty() && !s2.empty()) {
                sum = s1.pop().val + s2.pop().val + tmp;
                if (sum >= 10) {
                    tmp = 1;
                } else {
                    tmp = 0;
                }
                s.push(new ListNode(sum % 10));
            } else if (s1.empty() && !s2.empty()) {
                sum = s2.pop().val + tmp;
                if (sum >= 10) {
                    tmp = 1;
                } else {
                    tmp = 0;
                }
                s.push(new ListNode(sum % 10));
            } else if (s2.empty() && !s1.empty()) {
                sum = s1.pop().val + tmp;
                if (sum >= 10) {
                    tmp = 1;
                } else {
                    tmp = 0;
                }
                s.push(new ListNode(sum % 10));
            } else {
                s.push(new ListNode(1));
                tmp = 0;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode head = s.pop();
        dummy.next = head;
        
        while (!s.empty()) {
            head.next = s.pop();
            head = head.next;
        }
        
        return dummy.next;
    }
}