/*
Find the nth to last element of a singly linked list. 

The minimum number of nodes in list is n.

Example
Given a List  3->2->1->5->null and n = 2, return node  whose value is 1.
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

public class E_166_Nth_to_Last_Node_in_List {

    public static void main(String[] args) {

        ListNode input1 = {3,2,1,5};
        int input2 = 2;
        ListNode output = nthToLast(input1, input2);
        System.out.println("input: " + input1 + "\noutput: " + output);

    }

    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public static ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode a = head;
        ListNode b = head;
        while (n-- > 0) {
            a = a.next;
        }
        while (a != null) {
            a = a.next;
            b = b.next;
        }
        return b;
    }

}
