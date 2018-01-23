// speed beats 98%
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int sz = intervals.size();
        
        int[] starts = new int[sz];
        int[] ends = new int[sz];
        
        for (int i = 0; i < sz; ++i) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        List<Interval> results = new ArrayList<>();
        for (int i = 0, j = 0; i < sz; ++i) {
            if (i == sz - 1 || starts[i + 1] > ends[i]) {
                results.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        
        return results;
    }
}