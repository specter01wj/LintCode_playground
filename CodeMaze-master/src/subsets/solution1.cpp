class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        
        vector<vector<int>> results;
        vector<int> list;
        
        // std::sort(nums.begin(), nums.end());
        
        helper(nums, results, list, 0);
        
        return results;
        
    }

    // recursion
    void helper(vector<int>& nums, vector<vector<int>> &results, vector<int> list, int index) {
        
        results.push_back(list);
        
        for (int i = index; i != nums.size(); ++i) {
            list.push_back(nums[i]);
            helper(nums, results, list, i + 1);
            list.pop_back();
        }
    }
};