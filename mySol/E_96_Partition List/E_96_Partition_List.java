/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example
Given 1->4->3->2->5->2->null and x = 3,
return 1->2->2->4->3->5->null.
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

public class E_96_Partition_List {

    public static void main(String[] args) {

        int[] input = {1->4->3->2->5->2->null};
        ListNode output = partition(input, 3);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /*
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode head1 = new ListNode(0);
        ListNode tail1 = head1;
        ListNode head2 = new ListNode(0);
        ListNode tail2 = head2;
        while (head != null) {
            if (head.val < x) {
                tail1.next = head;
                tail1 = tail1.next;
                head = head.next;
                tail1.next = null;
            } else {
                tail2.next = head;
                tail2 = tail2.next;
                head = head.next;
                tail2.next = null;
            }

        }
        tail1.next = head2.next;
        return head1.next;
    }

}
