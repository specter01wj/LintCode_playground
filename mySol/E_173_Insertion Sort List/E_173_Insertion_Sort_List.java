/*
Sort a linked list using insertion sort.

Example
Given 1->3->2->0->null, return 0->1->2->3->null.
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

public class E_173_Insertion_Sort_List {

    public static void main(String[] args) {

        ListNode input = {1,3,2,0};
        ListNode output = insertionSortList(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public static ListNode insertionSortList(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);

        while (head != null) {
            ListNode n = dummy;
            while (n.next != null && n.next.val < head.val) n = n.next;
            ListNode next = head.next;
            head.next = n.next;
            n.next = head;
            head = next;
        }

        return dummy.next;
    }

}
