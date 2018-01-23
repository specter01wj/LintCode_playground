class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        if (l == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[l - 2] < nums[l - 1]) return l - 1;
        
        int start = 0;
        int end   = l - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) start = mid;
            else if (nums[mid] < nums[mid - 1]) end = mid;
            else return mid;
        }
        
        if (nums[start] > nums[end]) return start;
        else return end;
    }
}