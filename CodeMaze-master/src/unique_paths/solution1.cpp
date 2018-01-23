class Solution {
public:
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    int uniquePaths(int m, int n) {
        // wirte your code here
        int x[m][n];
        
        for (int i = 0; i != m; ++i) {
            x[i][0] = 1;
        }
        for (int j = 0; j != n; ++j) {
            x[0][j] = 1;
        }
        
        for (int i = 1; i != m; ++i) {
            for (int j = 1; j != n; ++j) {
                x[i][j] = x[i-1][j] + x[i][j-1];
            }
        }
        
        return x[m-1][n-1];
        
    }
};
