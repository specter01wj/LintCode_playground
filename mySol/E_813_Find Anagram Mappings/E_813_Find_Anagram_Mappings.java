/*
Given two lists A and B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.

We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.

These lists A and B may contain duplicates. If there are multiple answers, output any of them.

https://leetcode.com/problems/find-anagram-mappings/description/

 Notice
A, B have equal lengths in range [1, 100].
A[i], B[i] are integers in range [0, 10^5].

Example
Given A = [12, 28, 46, 32, 50] and B = [50, 12, 32, 46, 28], return [1, 4, 3, 2, 0].

Explanation:
as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4], and so on.
*/

import java.util.*;

public class E_813_Find_Anagram_Mappings {

    public static void main(String[] args) {

        int[] input1 = {12, 28, 46, 32, 50};
        int[] input2 = {50, 12, 32, 46, 28};
        int[] output = anagramMappings(input1, input2);
        System.out.println("input1: " + Arrays.toString(input1) + 
            " input2: " + Arrays.toString(input2) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param A: lists A
     * @param B: lists B
     * @return: the index mapping
     */
    public static int[] anagramMappings(int[] A, int[] B) {
        // Write your code here
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        
        for(int i =0;i<B.length;i++){
            if(!map.containsKey(B[i])){
                map.put(B[i],new LinkedList<Integer>());
            }
            
            map.get(B[i]).add(i);
        }
        
        int[] res = new int[A.length];
        
        for(int i =0;i<A.length;i++){
            List<Integer> list=map.get(A[i]);
            int index =list.get(list.size()-1);
            res[i]=index;
            list.remove(list.size()-1);
        }
        
        return res;
    }

}
