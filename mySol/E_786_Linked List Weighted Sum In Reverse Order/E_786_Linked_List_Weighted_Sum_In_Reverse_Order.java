/*
Given a linked list, find the weighted sum in reverse order. The weight is the number of nodes up to the end of the queue.

Example
Given 3 -> 2 -> 5 -> 1
return 29(3 * 4 + 2 * 3 + 5 * 2 + 1)
*/

import java.util.*;

public class E_786_Linked_List_Weighted_Sum_In_Reverse_Order {

    public static void main(String[] args) {

        ListNode input = {3,2,5,1};
        int output = weightedSumReverse(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + output);

    }

    /**
     * @param head: the given linked list
     * @return:  the weighted sum in reverse order
     */
    int sum = 0;
    
    int weightAdd(ListNode p){
        if (p == null) return 0;
        int dist = 1 + weightAdd(p.next);
        sum += p.val * dist;
        return dist;
    }
     
    public static int weightedSumReverse(ListNode head) {
        // write your code here
        weightAdd(head);
        return sum;
    }

}
