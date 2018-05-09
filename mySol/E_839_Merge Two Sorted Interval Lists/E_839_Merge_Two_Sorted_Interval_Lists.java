/*
Merge two sorted (ascending) lists of interval and return it as a new sorted list. The new sorted list should be made by splicing together the intervals of the two lists and sorted in ascending order.

 Notice
The intervals in the given list do not overlap.
The intervals in different lists may overlap.

Example
Given list1 = [(1,2),(3,4)] and list2 = [(2,3),(5,6)], return [(1,4),(5,6)].
*/

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

import java.util.*;

public class E_839_Merge_Two_Sorted_Interval_Lists {

    public static void main(String[] args) {

        int[][] input1 = {{1,2},{3,4};
        int[][] input2 = {{2,3},{5,6};
        List<Interval> output = mergeTwoInterval(input);
        System.out.println("input1: " + Arrays.deepToString(input1) + 
                            " input2: " + Arrays.deepToString(input2) + "\noutput: " + output);

    }

    /**
     * @param list1: one of the given list
     * @param list2: another list
     * @return: the new sorted list of interval
     */
    public static List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
        // write your code here
        List<Interval> results = new ArrayList<>();
        if (list1 == null || list2 == null) {
            return results;
        }
        
        Interval last = null, curt = null;
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).start < list2.get(j).start) {
                curt = list1.get(i);
                i++;
            } else {
                curt = list2.get(j);
                j++;
            }
            
            last = merge(results, last, curt);
        }
        
        while (i < list1.size()) {
            last = merge(results, last, list1.get(i));
            i++;
        }
        
        while (j < list2.size()) {
            last = merge(results, last, list2.get(j));
            j++;
        }
        
        if (last != null) {
            results.add(last);
        }
        return results;
    }
    
    private Interval merge(List<Interval> results, Interval last, Interval curt) {
        if (last == null) {
            return curt;
        }
        
        if (curt.start > last.end) {
            results.add(last);
            return curt;
        }
        
        last.end = Math.max(last.end, curt.end);
        return last;
    }

}
