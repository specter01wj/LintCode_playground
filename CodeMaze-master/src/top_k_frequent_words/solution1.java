// Max PQ and HeapSort! Implete my own priority queue
class Solution {
    private List<String> pq;
    private Map<String, Integer> map;
    
    public List<String> topKFrequent(String[] words, int k) {
        map = new HashMap<>();
        pq = new ArrayList<>();
        pq.add("0");
        
        for (String s : words) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        
        for (String s : map.keySet()) {
            insert(s);
        }
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            result.add(delMax());
        }
        
        return result;
    }
    
    private void insert(String x) {
        pq.add(x);
        swim(pq.size() - 1);
    }
    
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k, k/2);
            k /= 2;
        }
    }
    
    private String delMax() {
        String max = pq.get(1);
        exch(1, pq.size() - 1);
        pq.remove(pq.size() - 1);
        sink(1);
        return max;
    }
    
    private void sink(int k) {
        while (2 * k <= pq.size() - 1) {
            int j = 2 * k;
            if (j < pq.size() - 1 && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }
    
    private void exch(int i, int j) {
        String s = pq.get(i);
        pq.set(i, pq.get(j));
        pq.set(j, s);
    }
    
    private boolean less(int i, int j) {
        if (map.get(pq.get(i)) == map.get(pq.get(j))) {
        	// If two words have the same frequency, then the word with the lower alphabetical order comes first.
            return pq.get(i).compareTo(pq.get(j)) > 0; 
        } else {
            return map.get(pq.get(i)) < map.get(pq.get(j));
        }
    }
}