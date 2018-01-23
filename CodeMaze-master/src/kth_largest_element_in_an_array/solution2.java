class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, (i1, i2)->Integer.compare(i2, i1));
        for (int i : nums) {
            pq.offer(i);
        }
        
        int res = pq.poll();
        for (int i = 1; i < k; i++) {
            res = pq.poll();
        }
        
        return res;
    }
}