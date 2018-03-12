/*
Given a linked list, swap every two adjacent nodes and return its head.

Example
Given 1->2->3->4, you should return the list as 2->1->4->3.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import java.util.*;

public class E_451_Swap_Nodes_in_Pairs {

    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        ListNode output = swapPairs(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param head: a ListNode
     * @return: a ListNode
     */
    public static ListNode swapPairs(ListNode head) {
        // write your code here
        if (head == null) return null;
        if (head.next == null) return head;
        head.next.next = swapPairs(head.next.next);
        ListNode tmp = head.next;
        head.next = tmp.next;
        tmp.next = head;
        return tmp;
    }

}
