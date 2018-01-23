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
        
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        List<Interval> results = new ArrayList<>();
        
        if (sz <= 1) return intervals;
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < sz; ++i) {
            if (intervals.get(i).start <= end) { 
                // overlap, moving end.
                end = Math.max(end, intervals.get(i).end);
            } else {
                results.add(new Interval(start, end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        results.add(new Interval(start, end));
        
        return results;
    }
}