class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if (size <= 2) return 0;
        
        int water = 0;
        int left = 0;
        int right = size - 1;
        
        int maxLeft = 0;
        int maxRight = 0;
        
        while (left < right) {
            if (height[left] <= height[right]) {
                maxLeft = Math.max(height[left], maxLeft);
                water += maxLeft - height[left];
                left++;
            } else {
                maxRight = Math.max(height[right], maxRight);
                water += maxRight - height[right];
                right--;
            }
        }
        return water;
    }
}