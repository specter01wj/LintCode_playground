class Solution {
    public int countBinarySubstrings(String s) {
        
        int res = 0;
        
        if (s == null || s.length() == 1) return res;
        
        int prevSeq = 1;
        int currSeq = 1;
        
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i-1)) currSeq++;
            else {
                prevSeq = currSeq;
                currSeq = 1;
            }
            
            if (prevSeq >= currSeq) res++;
        }
        
        return res;
    }
}