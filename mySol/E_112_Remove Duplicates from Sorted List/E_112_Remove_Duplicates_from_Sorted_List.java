/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/
/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;

public class E_112_Remove_Duplicates_from_Sorted_List {

    public static void main(String[] args) {

        ListNode input = {1,1,2};
        ListNode output = deleteDuplicates(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        ListNode p = head;
        while (p != null && p.val == head.val) {
            p = p.next;
        }

        head.next = deleteDuplicates(p);

        return head;
    }

}
