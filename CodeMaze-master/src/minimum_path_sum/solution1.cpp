class Solution {
public:
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    int minPathSum(vector<vector<int> > &grid) {
        // write your code here
        int m, n;
        m = grid.size();
        if (m > 0) n = grid[m - 1].size();
        
        if (m == 0 || n == 0) return 0;
        
        vector<vector<int> > result(m, vector<int>(n));
        
        result[0][0] = grid[0][0];
        
        for (int i = 1; i != m; ++i) {
            result[i][0] = result[i-1][0] + grid[i][0];
        }
        
        for (int j = 1; j != n; ++j) {
            result[0][j] = result[0][j-1] + grid[0][j];
        }
        
        for (int i = 1; i != m; ++i) {
            for (int j = 1; j != n; ++j) {
                result[i][j] = min(result[i-1][j], result[i][j-1]) + grid[i][j];
            }
        }
        
        return result[m-1][n-1];
    }
};
