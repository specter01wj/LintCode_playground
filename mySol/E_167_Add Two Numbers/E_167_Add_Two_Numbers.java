/*
You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

Example
Given 7->1->6 + 5->9->2. That is, 617 + 295.

Return 2->1->9. That is 912.

Given 3->1->5 and 5->9->2, return 8->0->8.
*/

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

import java.util.*;

public class E_167_Add_Two_Numbers {

    public static void main(String[] args) {

        ListNode input1 = {7,1,6};
        ListNode input2 = {5,9,2};
        ListNode output = addLists(input1, input2);
        System.out.println("input1: " + input1 + "\noutput: " + output);

    }

    /*
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public static ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                ptr.next = new ListNode((l2.val + carry) % 10);
                carry = (l2.val + carry) / 10;
                l2 = l2.next;
            } else if (l2 == null) {
                ptr.next = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
                l1 = l1.next;
            } else {
                ptr.next = new ListNode((l1.val + l2.val + carry) % 10);
                carry = (l1.val + l2.val + carry) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        if (carry == 1) {
            ptr.next = new ListNode(1);
        }
        return head.next;
    }

}
