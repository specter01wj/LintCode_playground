class Solution {
    public int findKthLargest(int[] nums, int k) {
        int sz = nums.length;
        int i = findKthLargestHelper(nums, 0, sz - 1,  sz - k + 1);
        return nums[i];
    }
    
    // Quick Select
    private int findKthLargestHelper(int[] nums, int start, int end, int k) {
        int i = start;
        int j = end;
        int pivot = nums[end];
        while (i < j) {
            if (nums[i++] > pivot) exch(nums, --i, --j);
        }
        exch(nums, i, end);
        
        int m = i - start + 1;
        if (m == k) return i;
        else if (m > k) return findKthLargestHelper(nums, start, i - 1, k);
        else return findKthLargestHelper(nums, i + 1, end, k - m);
    }
    
    private void exch(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void shuffle(int[] nums) {
        final Random random = new Random();
        for (int i = 1; i < nums.length; ++i) {
            final int j = random.nextInt(i + 1);
            exch(nums, i, j);
        }
    }
}