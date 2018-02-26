/*
Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.

Example
Linked list is 1->2->3->4, and given node 3, delete the node in place 1->2->4
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

public class E_372_Delete_Node_in_the_Middle_of_Singly_Linked_List {

    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        deleteNode(input, 3);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + input);

    }

    /*
     * @param node: the node in the list should be deletedt
     * @return: nothing
     */
    public static void deleteNode(ListNode node) {
        // write your code here
        if (node == null || node.next == null)
            return;
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
        return;
    }

}
