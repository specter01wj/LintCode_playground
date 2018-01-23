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
        
        int count = pLength;
        int leftIndex = 0;
        int rightIndex = 0;
        
        while (rightIndex < sLength) {
            char rc = s.charAt(rightIndex);
            if (m.containsKey(rc)) {
                m.put(rc, m.get(rc) - 1);
                if (m.get(rc) >= 0) {
                    count--;
                }
            }
                        
            rightIndex++;
            
            if (count == 0) {
                result.add(leftIndex);
            }
            
            char lc = s.charAt(leftIndex);
            if (rightIndex - leftIndex == pLength) {
                if (m.containsKey(lc)) {
                    m.put(lc, m.get(lc) + 1);
                    if (m.get(lc) > 0) {
                        count++;
                    }
                }
                leftIndex++;
            }
            
        }
        
        return result;
    }
}