/*
Merge two sorted (ascending) linked lists and return it as a new sorted list. The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.

Example
Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null.
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

public class E_165_Merge_Two_Sorted_Lists {

    public static void main(String[] args) {

        ListNode input1 = {1,3,8,11,15};
        ListNode input2 = {2};
        ListNode output = mergeTwoLists(input1, input2);
        System.out.println("input: " + input1 + "\noutput: " + output);

    }

    /*
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }

        if (l1 != null) {
            ptr.next = l1;
        } else if (l2 != null) {
            ptr.next = l2;
        }

        return head.next;

    }

}
