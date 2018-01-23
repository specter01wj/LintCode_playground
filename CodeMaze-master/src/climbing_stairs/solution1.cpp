class Solution {
public:
    /**
     * @param n: An integer
     * @return: An integer
     */
    int climbStairs(int n) {
        // write your code here
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        vector<int> v(n);
        v[0] = 1;
        v[1] = 2;
        
        for (int i = 2; i != n; ++i) {
            v[i] = v[i-1] + v[i-2];
        }
        
        return v[n-1];
    }
};
