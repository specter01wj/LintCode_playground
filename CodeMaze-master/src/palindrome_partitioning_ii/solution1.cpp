class Solution {
public:
    /**
     * @param s a string
     * @return an integer
     */
    
    bool isPalindrome(string s) {
        int n = s.size();
        if (n == 0 || n == 1) {
            return true;
        }
        for (int i = 0; i != n / 2; ++i) {
            if (s[i] != s[n-i-1]) return false;
        }
        return true;
        
    }
    int minCut(string s) {
        // write your code here
        int n = s.size();
        if (n == 0 || n == 1) return 0;
        
        vector<int> f(n+1, INT_MAX);
        f[0] = 0;
        f[1] = 0;
        for (int i = 2; i < n + 1; ++i) {
            if (isPalindrome(s.substr(0, i))) f[i] = 0;
            else {
                for (int j = 1; j <= i; ++j) {
                    if (isPalindrome(s.substr(i-j, j))) {
                        f[i] = min(f[i], f[i-j]+1);
                    }
                }
            }
            
            
        }
        
        return f[n];
    }
};

