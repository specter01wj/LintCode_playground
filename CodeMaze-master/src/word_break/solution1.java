class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        for (int i = 1; i < res.length; ++i) {
            res[i] = false;
        }
        
        for (int i = 1; i < res.length; ++i) {
            for (int j = 0; j < i; ++j) {
                res[i] = res[i] || res[j] && contains(s.substring(j, i), wordDict);
            }
        }
        
        return res[s.length()];
    }
    
    private boolean contains(String s, List<String> wordDict) {
        for (String word : wordDict) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }
}