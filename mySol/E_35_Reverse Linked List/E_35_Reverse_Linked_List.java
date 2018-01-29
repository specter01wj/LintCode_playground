/*
Reverse a linked list.

Example
For linked list 1->2->3, the reversed linked list is 3->2->1
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

public class E_35_Reverse_Linked_List {

    public static void main(String[] args) {

        ListNode input = {1,2,3};
        ListNode output = insert(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public static ListNode reverse(ListNode head) {
        // write your code here
        ListNode a = null;
        ListNode b = head;

        while (b != null) {
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        return a;
    }

}
