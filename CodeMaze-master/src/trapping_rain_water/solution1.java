class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int water = 0;
        for (int i = 1; i < size - 1; ++i) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; --j) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < size; ++j) {
                maxRight = Math.max(maxRight, height[j]);
            }
            water += Math.min(maxLeft, maxRight) - height[i];
        }
        
        return water;
    }
}