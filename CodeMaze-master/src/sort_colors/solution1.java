class Solution {
    public static final int RED   = 0;
    public static final int WHITE = 1;
    public static final int BLUE  = 2;
    
    public void sortColors(int[] nums) {
        int start = 0;
        int end   = nums.length - 1;
        
        for (int i = 0; i < end + 1; ++i) {
            if (nums[i] == RED && i != start) {
                swap(nums, start++, i--);
            } else if (nums[i] == BLUE) {
                swap(nums, end--, i--);
            }
        }
    }
    
    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}