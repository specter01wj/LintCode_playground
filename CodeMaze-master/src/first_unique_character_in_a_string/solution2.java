/*
class Solution {
    public int firstUniqChar(String s) {
        int[] map = new int[256];
        
        for (int i = 0; i < s.length(); ++i) {
            map[s.charAt(i)]++;
        }
        
        for (int i = 0; i < s.length(); ++i) {
            if (map[s.charAt(i)] == 1) return i;
        }
        
        return -1;
    }
}
*/
class Solution {
    public int firstUniqChar(String s) {
        int[] map = new int[256];
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; ++i) {
            map[charArray[i]]++;
        }
        
        for (int i = 0; i < charArray.length; ++i) {
            if (map[charArray[i]] == 1) return i;
        }
        
        return -1;
    }
}