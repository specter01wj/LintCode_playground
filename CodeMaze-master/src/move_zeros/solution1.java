class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                exch(nums, i, nonZeroIndex+1);
                nonZeroIndex++;
            }
        }
    }
    
    private void exch(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}