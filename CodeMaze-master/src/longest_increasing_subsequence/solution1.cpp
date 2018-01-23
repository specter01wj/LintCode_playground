class Solution {
public:
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    int longestIncreasingSubsequence(vector<int> nums) {
        // write your code here
        vector<int> f(nums.size(), 0);
        
        for (int i = 0; i < nums.size(); ++i) {
            f[i] = max(f[i], 1);
            for (int j = i + 1; j < nums.size(); ++j) {
                if (nums[i] < nums[j]) {
                    f[j] = max(f[j], f[i] + 1);
                }
            }
        }
        int lis = 0;
        for (int i = 0; i != nums.size(); ++i) {
            lis = max(lis, f[i]);
        }
        return lis;
    }
};
