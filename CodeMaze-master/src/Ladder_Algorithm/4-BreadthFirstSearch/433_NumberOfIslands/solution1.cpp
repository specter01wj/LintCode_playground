class Solution {
public:
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    int numIslands(vector<vector<bool>>& grid) {
        // Write your code here
        if (grid.size() == 0 || grid[0].size() == 0) {
            return 0;
        }
        
        int m = grid.size();
        int n = grid[0].size();
        int count = 0;
        
        for (int i = 0; i != m; ++i) {
            for (int j = 0; j != n; ++j) {
                if (grid[i][j]) {
                    dfs(grid, i, j);
                    ++count;
                }
            }
        }
        
        return count;
    }
private:
    void dfs(vector<vector<bool>> &grid, int i, int j) {
        grid[i][j] = false;
        if (i - 1 >= 0 && grid[i-1][j]) dfs(grid, i-1, j);
        if (i + 1 < grid.size() && grid[i+1][j]) dfs(grid, i+1, j);
        if (j - 1 >= 0 && grid[i][j-1]) dfs(grid, i, j-1);
        if (j + 1 < grid[0].size() && grid[i][j+1]) dfs(grid, i, j+1); 
    }
};