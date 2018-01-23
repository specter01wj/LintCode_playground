public class Solution {

    private static final int MOD = 10_000_000;
    private static final int BASE = 41;
    
    /**
     * @param haystack a source string
     * @param needle a target string
     * @return an integer as index
     */
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        
        if (nl == 0) {
            return 0;
        }
        
        if (hl == 0 || hl < nl) {
            return -1;
        }
        
        int nHash = 0;
        for (int i = 0; i < nl; ++i) {
            nHash = (nHash * BASE + needle.charAt(i)) % MOD;
        }
        
        int power = 1;
        for (int i = 0; i < nl; ++i) {
            power = power * BASE % MOD;
        }
        
        int hHash = 0;
        for (int i = 0; i < hl; ++i) {
            
            if (i < nl) {
                hHash = (hHash * BASE + haystack.charAt(i)) % MOD;
            } else {
                hHash = (hHash * BASE + haystack.charAt(i) - (haystack.charAt(i - nl)) * power) % MOD;
                if (hHash < 0) {
                    hHash += MOD;
                }
            }

            if (hHash == nHash && needle.equals(haystack.substring(i-nl+1, i+1))) {
                return i - nl + 1;
            }
        }
        return -1;
    }
}