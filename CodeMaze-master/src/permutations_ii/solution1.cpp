class Solution {
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>> results;
        std::sort(nums.begin(), nums.end());
        permuteUniqueHelper(results, nums, 0);
        
        return results;
    }
private:
    void permuteUniqueHelper(vector<vector<int>> &results, vector<int> path, int startIndex) {
        if (startIndex == path.size()) {
            results.push_back(path);
        }
        
        for (int i = startIndex; i != path.size(); ++i) {
            
            if (i != 0 && i != startIndex && path[i] == path[startIndex]) continue;
            
            swap(path[i], path[startIndex]);
            permuteUniqueHelper(results, path, startIndex + 1);
            //swap(path[i], path[startIndex]);
        }
    }
};