class Solution {
public:
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    int minimumTotal(vector<vector<int> > &triangle) {
        // write your code here
        int m = triangle.size();
        
        if (m == 0) return 0;
        if (m == 1) return triangle[0][0];
        
        vector<vector<int> > result(m, vector<int>(m));
        
        result[0][0] = triangle[0][0];
        
        for (int i = 1; i < m; ++i) {
            result[i][0] = result[i-1][0] + triangle[i][0];
            result[i][i] = result[i-1][i-1] + triangle[i][i];
        }
        
        for (int i = 2; i < m; ++i) {
            for (int j = 1; j < i; ++j) {
                result[i][j] = min(result[i-1][j-1], result[i-1][j]) + triangle[i][j];
            }
        }
            
        int min_sum = INT_MAX;
        for (int i = 0; i < m; ++i) {
            min_sum = min(min_sum, result[m-1][i]);
        }
        
        return min_sum;
    }
};
