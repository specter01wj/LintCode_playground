// charAt() is faster than toCharArray()
/*
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        char[] charArray = s.toCharArray();
        
        for (char c : charArray) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        
        for (int i = 0; i < charArray.length; ++i) {
            if (map.get(charArray[i]) == 1) return i;
        }
        
        return -1;
    }
}
*/
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); ++i) {
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) == 1) return i;
        }
        
        return -1;
    }
}