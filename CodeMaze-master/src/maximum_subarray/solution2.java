class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArrayHelper(nums, 0, nums.length - 1);
    }
    
    private int maxSubArrayHelper(int[] nums, int start, int end) {
        if (start > end) return Integer.MIN_VALUE;
        int sum;
        
        int mid = start + (end - start) / 2;
        int leftMax = 0;
        sum = 0;
        for (int i = mid - 1; i >= start; --i) {
            sum += nums[i];
            leftMax = Math.max(leftMax, sum);
        }
        int rightMax = 0;
        sum = 0;
        for (int i = mid + 1; i <= end; ++i) {
            sum += nums[i];
            rightMax = Math.max(rightMax, sum);
        }
        
        int leftAns = maxSubArrayHelper(nums, start, mid - 1);
        int rightAns = maxSubArrayHelper(nums, mid + 1, end);
        
        return Math.max(leftMax + nums[mid] + rightMax, Math.max(leftAns, rightAns));
        
    }
}