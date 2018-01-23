/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// fast, but have issue when sum is larger than Integer.MAX_VALUE
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i1 = 0;
        int i2 = 0;
        
        while (l1 != null) {
            i1 = i1 * 10 + l1.val;
            l1 = l1.next;
        }
        
        
        while (l2 != null) {
            i2 = i2 * 10 + l2.val;
            l2 = l2.next;
        }
        
        int sum = i1 + i2;
        System.out.println(sum);
        if (sum == 0) return new ListNode(0);
        
        ListNode head = null;
        ListNode node = null;
        
        while (sum > 0) {
            head = new ListNode(sum % 10);
            head.next = node;
            node = head;
            sum /= 10;
        }
        
        return head;
    }
}