/*
Given a non-overlapping interval list which is sorted by start point.

Insert a new interval into it, make sure the list is still in order and non-overlapping (merge intervals if necessary).

Example
Insert [2, 5] into [[1,2], [5,9]], we get [[1,9]].

Insert [3, 4] into [[1,2], [5,9]], we get [[1,2], [3,4], [5,9]].
*/
/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
import java.util.*;

public class E_30_Insert_Interval {

    public static void main(String[] args) {

        List<Interval> input1 = {{1,2}, {5,9}};
        List<Interval> input2= {2,5};
        List<Integer> output = insert(input1, input2);
        System.out.println("input: " + input1 + " and " + input2 + "\noutput: " + output);

    }

    /*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        int size = intervals.size();

        ArrayList<Interval> result = new ArrayList<>();
        boolean inserted = false;


        int i = 0;
        int j = -1;

        while (i < size || inserted == false) {

            Interval candidate = null;
            if (i == size || (inserted == false && intervals.get(i).start > newInterval.start)) {
                candidate = newInterval;
                inserted = true;
            } else {
                candidate = intervals.get(i);
                i++;
            }

            if (j == -1) {
                result.add(candidate);
                j++;
            } else {
                Interval prev = result.get(j);
                if (prev.end >= candidate.start) {
                    prev.end = Math.max(candidate.end, prev.end);
                } else {
                    result.add(candidate);
                    j++;
                }
            }
        }

        return result;
    }

}
