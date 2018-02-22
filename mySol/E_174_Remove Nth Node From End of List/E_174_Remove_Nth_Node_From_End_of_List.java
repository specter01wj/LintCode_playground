/*
Given a linked list, remove the nth node from the end of list and return its head.

 Notice
The minimum number of nodes in list is n.

Example
Given linked list: 1->2->3->4->5->null, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5->null.
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */

import java.util.*;

public class E_174_Remove_Nth_Node_From_End_of_List {

    public static void main(String[] args) {

        ListNode input = {1,2,3,4,5};
        int key = 2;
        ListNode output = removeNthFromEnd(input, key);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode a = dummy, b = dummy;
        while (n-- > 0) {
            a = a.next;
        }
        while (a.next != null) {
            a = a.next;
            b = b.next;
        }
        b.next = b.next.next;
        return dummy.next;
    }

}
