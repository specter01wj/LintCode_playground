/*
Give a linked list, and store the values of linked list in reverse order into an array.

 Notice
You can not change the structure of the original linked list.

Example
Given 1 -> 2 -> 3 -> null, return [3,2,1].
*/

import java.util.*;

public class E_822_Reverse_Order_Storage {

    public static void main(String[] args) {

        int[] input = {1,2,3};
        List<Integer> output = reverseStore(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param head: the given linked list
     * @return: the array that store the values in reverse order 
     */
    List<Integer> res = new ArrayList<>();
    
    private void store(ListNode p) {
        if (p == null) {
            return;
        }
        
        store(p.next);
        res.add(p.val);
    }
     
    public List<Integer> reverseStore(ListNode head) {
        // write your code here
        store(head);
        return res;
    }

}
