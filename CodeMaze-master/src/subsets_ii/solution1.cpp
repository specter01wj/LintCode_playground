class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path;
        
        std::sort(nums.begin(), nums.end());
        
        subsetsWithDupHelper(res, path, nums, 0);
        
        return res;
    }
private:
    void subsetsWithDupHelper(vector<vector<int>> &res, vector<int> path, vector<int> &nums, int index) {
        res.push_back(path);
        
        for (int i = index; i != nums.size(); ++i) {
            if (i != 0 && i != index && nums[i] == nums[i-1]) {
                continue;
            }
            
            path.push_back(nums[i]);
            subsetsWithDupHelper(res, path, nums, i + 1);
            path.pop_back();
        }
    }
};