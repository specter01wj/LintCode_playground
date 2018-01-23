class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        if (grid.length == 0 || grid[0].length == 0) {
            return perimeter;
        }
        
        int rowCount = grid.length;
        int colCount = grid[0].length;
        
        for (int i = 0; i < rowCount; ++i) {
            for (int j = 0; j < colCount; ++j) {
                if (grid[i][j] == 1) {
                    // left
                    if (j == 0 || grid[i][j-1] == 0) perimeter++;
                    // right
                    if (j == colCount - 1 || grid[i][j+1] == 0) perimeter++;
                    // up
                    if (i == 0 || grid[i-1][j] == 0) perimeter++;
                    // down
                    if (i == rowCount - 1 || grid[i+1][j] == 0) perimeter++;
                }
            }
        }
        
        return perimeter;
    }
}