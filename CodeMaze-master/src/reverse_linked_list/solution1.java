/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode dummy = null;
        while (head.next != null) {
            ListNode node = head.next;
            head.next = dummy;
            dummy = head;
            head = node;
        }
        head.next = dummy;
        return head;
    }
}

/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while (head != null) {
            ListNode node = head.next;
            head.next = dummy;
            dummy = head;
            head = node;
        }
        
        return dummy;
    }
}
*/