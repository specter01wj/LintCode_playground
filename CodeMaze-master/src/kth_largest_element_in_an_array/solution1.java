class Solution {
    private int[] pq;
    private int sz;
    public int findKthLargest(int[] nums, int k) {
        pq = new int[nums.length + 1];
        sz = 1;
        for (int i : nums) {
            insert(i);
        }
        
        int res = delMax();
        for (int i = 1; i < k; ++i) {
            res = delMax();
        }
        
        return res;
    }
    
    private void insert(int i) {
        pq[sz++] = i;
        swim(sz - 1);
    }
    
    private int delMax() {
        int res = pq[1];
        exch(1, sz - 1);
        sz--;
        sink(1);
        
        return res;
    }
    
    private void sink(int k) {
        while (2 * k <= sz - 1) {
            int j = k * 2;
            if (j < sz - 1 && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }
    
    private void swim(int pos) {
        while (pos > 1 && less(pos / 2, pos)) {
            exch(pos / 2, pos);
            pos /= 2;
        }
    }
    
    private void exch(int i, int j) {
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }
    
    private boolean less(int i, int j) {
        return pq[i] < pq[j];
    }
}