class Solution {
public:
    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    bool wordBreak(string s, unordered_set<string> &dict) {
        // write your code here
        if (s.size() == 0) return true;
        
        string::size_type max_length = 0;
        for (auto x : dict) {
            max_length = max(x.size(), max_length);
        }
        
        vector<bool> f(s.size() + 1, false);
        f[0] = true;
        for (int i = 1; i < s.size() + 1; ++i) {
            for (int j = 1; j <= max_length && j <= i; ++j) {
                if (!f[i-j]) continue;
                f[i] = f[i-j] && (dict.find(s.substr(i-j, j)) != dict.end());
                if (f[i]) break;
            }
            if (f[i] && dict.find(s.substr(i)) != dict.end()) {
                f[s.size()] = true;
                break;
            }
        }
        
        return f[s.size()];
    }
};