class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            
            // or use but slower
            // map.putIfAbsent(key, new ArrayList<>());
            // map.get(key).add(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

        }
        List<List<String>> results = new ArrayList<>(map.values());
        
        return results;
    }
}