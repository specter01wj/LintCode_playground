/*
Count how many nodes in a linked list.

Example
Given 1->3->5, return 3.
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

public class N_466_Count_Linked_List_Nodes {

    public static void main(String[] args) {

        int input = 1;
        int output = countNodes(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        int count = 0;
        for (ListNode n = head; n != null; n = n.next) {
            count++;
        }
        return count;
    }

    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

}
