class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < nums.length; ++i) {
            sum = nums[i];
            maxSum = Math.max(maxSum, sum);
            for (int j = i + 1; j < nums.length; ++j) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}