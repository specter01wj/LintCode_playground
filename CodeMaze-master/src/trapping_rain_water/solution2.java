class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if (size <= 2) return 0;
        int water = 0;
        int[] maxLeft = new int[size];
        int[] maxRight = new int[size];
        
        maxLeft[0] = height[0];
        for (int i = 1; i < size; ++i) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        }
        
        maxRight[size-1] = height[size-1];
        for (int i = size - 2; i >= 0; --i) {
            maxRight[i] = Math.max(maxRight[i+1], height[i]);
        }
        for (int i = 1; i < size - 1; ++i) {
            water += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        
        return water;
    }
}