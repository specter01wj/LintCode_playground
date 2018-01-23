// dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int[] dp = new int[nums.length]; // dp[i] means the maximum subarray ending with num[i];
        dp[0] = nums[0];
        
        int maxSum = dp[0];
        
        for (int i = 1; i < nums.length; ++i) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            maxSum = Math.max(maxSum, dp[i]);
        }
        
        return maxSum;
    }
}