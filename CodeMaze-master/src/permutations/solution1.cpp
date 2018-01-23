class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> results;
        permuteHelper(results, nums, 0);
        
        return results;
    }
private:
    void permuteHelper(vector<vector<int>> &results, vector<int> path, int startIndex) {
        if (startIndex == path.size()) results.push_back(path);
        
        for (int i = startIndex; i != path.size(); ++i) {
            swap(path[i], path[startIndex]);
            permuteHelper(results, path, startIndex + 1);
            //swap(path[i], path[startIndex]);
        }
    }
};