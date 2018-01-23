class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        int sLength = s.length();
        int pLength = p.length();
        
        if (s == null || p == null || pLength > sLength) {
            return result;
        }
        
        int[] m = new int[256];
        
        for (char c : p.toCharArray()) {
            ++m[c];
        }
        
        for (int i = 0; i < sLength - pLength + 1; ++i) {
            // int[] tmp = Arrays.copyOf(m, m.length);
            int[] tmp = m.clone();
            boolean found = true;
            for (int j = 0; j < pLength; ++j) {
                char c = s.charAt(i + j);
                if (--tmp[c] < 0) {
                    found = false;
                    break;
                }
            }
            if (found) result.add(i);
        }
        
        return result;
    }
}