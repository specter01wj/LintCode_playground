/*
Remove all elements from a linked list of integers that have value val.

Example
Given 1->2->3->3->4->5->3, val = 3, you should return the list as 1->2->4->5

*/

/*
Thoughts:
While loop through. Maintain a parent, so it can be used to skip current node.
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

public class N_452_Remove_Linked_List_Elements {

    public static void main(String[] args) {

        int input = 2;
        int output = removeElements(null, input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode parent = new ListNode(0);
        parent.next = head;
        ListNode dummy = parent;
        while (head != null) {
            if (head.val == val) {
                parent.next = head.next;
            } else {
                parent = parent.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
