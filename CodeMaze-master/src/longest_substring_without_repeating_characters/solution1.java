class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if (l <= 1) return l;
        int start = 0;
        int end = 1; // exclusive
        int longestLength = 1;
        int probe = 1;
        while (probe < l) {
            String cur = s.substring(start, end);
            if (cur.indexOf(s.charAt(probe)) != -1) {
                if (end - start > longestLength) {
                    longestLength = end - start;
                }
                start = start + cur.indexOf(s.charAt(probe)) + 1;
            }
            
            end = ++probe;
        }
        if (end - start > longestLength) {
            longestLength = end - start;
        }
        return longestLength;
    }
}