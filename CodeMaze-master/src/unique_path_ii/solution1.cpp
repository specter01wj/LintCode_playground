class Solution {
public:
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */ 
    int uniquePathsWithObstacles(vector<vector<int> > &obstacleGrid) {
        // write your code here
        int m = obstacleGrid.size();
        int n;
        if (m > 0) {
            n = obstacleGrid[0].size();
            if (n == 0) return 0;
        } else {
            return 0;
        }
        
        int x[m][n];
        
        if (obstacleGrid[0][0] == 1) return 0;
        
        x[0][0] = 1;
        
        for (int i = 1; i != m; ++i) {
            if (obstacleGrid[i][0] != 1) {
                x[i][0] = x[i-1][0];
            } else {
                x[i][0] = 0;
            }
        }
        
        for (int j = 1; j != n; ++j) {
            if (obstacleGrid[0][j] != 1) {
                x[0][j] = x[0][j-1];
            } else {
                x[0][j] = 0;
            }
        }
        
        for (int i = 1; i != m; ++i) {
            for (int j = 1; j != n; ++j) {
                if (obstacleGrid[i][j] == 1) x[i][j] = 0;
                else x[i][j] = x[i-1][j] + x[i][j-1];
            }
        }
        
        return x[m-1][n-1];
    }
};