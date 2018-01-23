class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int start = 1;
        int end = x;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) return mid;
            else if (mid < x / mid) start = mid;
            else end = mid;
        }
        
        if (end <= x / end) return end;
        else return start;
    }
}