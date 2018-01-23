public class Solution {
    /**
     * @param source a source string
     * @param target a target string
     * @return an integer as index
     */
    public int strStr2(String source, String target) {
        // Write your code here
        if (source == null || target == null) {
            return -1;
        }
        
        int t_length = target.length();
        if (t_length == 0) return 0;
        
        int s_length = source.length();
        if (s_length == 0 || s_length < t_length) return -1;
        
        int mn = 41;
        int mod = Integer.MAX_VALUE / mn;
        
        int t_hash = 0;
        for (int i = 0; i < t_length; ++i) {
            t_hash = (t_hash * mn + (target.charAt(i) - 'a')) % mod;
        }
        
        int power = 1;
        for (int i = 0; i < t_length - 1; ++i) {
            power = power * mn % mod;
        }
        
        int s_hash = 0;
        for (int i = 0; i < s_length; ++i) {
            if (i > t_length - 1) {
                s_hash = (s_hash - power * (source.charAt(i - t_length) - 'a')) % mod;
            }
            
            s_hash = (s_hash * mn + (source.charAt(i) - 'a')) % mod;
            if (s_hash < 0) {
                s_hash += mod;
            }
            
            if (i >= t_length - 1 && s_hash == t_hash) {
                if (target.equals(source.substring(i - t_length + 1, i + 1))) {
                    return i - t_length + 1;
                }
            }
        }
        
        return -1;
    }
}