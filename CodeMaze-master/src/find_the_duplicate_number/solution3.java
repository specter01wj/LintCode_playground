class Solution {
    public int findDuplicate(int[] nums) {
        // Write your code here
        int start = 1;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (check_smaller_num(mid, nums) <= mid) {
                start = mid;
            } else {
                end = mid;
            }
        }
            
        if (check_smaller_num(start, nums) <= start) {
            return end;
        }
        return start;
    }
    
    public int check_smaller_num(int mid, int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid){
                cnt++;
            }
        }
        return cnt;
    }
}