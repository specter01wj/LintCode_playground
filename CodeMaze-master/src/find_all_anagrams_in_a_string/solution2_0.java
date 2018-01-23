class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        int sLength = s.length();
        int pLength = p.length();
        
        if (s == null || p == null || pLength > sLength) {
            return result;
        }
        
        Map<Character, Integer> m = new HashMap<>();
        
        for (char c : p.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < sLength - pLength + 1; ++i) {
            Map<Character, Integer> tmp = new HashMap<>(m);
            boolean found = true;
            for (int j = 0; j < pLength; ++j) {
                char c = s.charAt(i + j);
                if (!tmp.containsKey(c)) {
                    found = false;
                    break;
                }
                tmp.put(c, tmp.get(c) - 1);
                if (tmp.get(c) < 0) {
                    found = false;
                    break;
                }
            }
            if (found) result.add(i);
        }
        
        return result;
    }
}