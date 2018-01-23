class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;
        if (chars.length == 1) return 1;
        int l = 0;
        int i = 0;
        int count;
        while (i < chars.length) {
            count = 1;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            chars[l++] = chars[i];
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[l++] = c;
                }
            }
            i++;
        }
        return l;
    }
}