class Solution {
    public List<Integer> lexicalOrder(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = i + 1;
        }
        
        shuffle(arr);
        lexicalSort(arr, 0, n - 1);
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            res.add(arr[i]);
        }
        
        return res;
    }
    
    private void lexicalSort(int[] arr, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(arr, lo, hi);
        lexicalSort(arr, lo, j - 1);
        lexicalSort(arr, j + 1, hi);
    }
    
    private int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) break;
            }
            
            while (less(a[lo], a[--j])) {
                if (j == lo) break;
            }
            
            if (i >= j) break;
            exch(a, i, j);
        }
        
        exch(a, lo, j);
        return j;
    }
    
    private void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    private boolean less(int i, int j) {
        String si = Integer.toString(i);
        String sj = Integer.toString(j);
        return si.compareTo(sj) < 0;
    }
    
    private void shuffle(int[] a) {
        final Random random = new Random();
        for (int i = 1; i < a.length; ++i) {
            final int j = random.nextInt(i + 1);
            exch(a, i, j);
        }
    }
}