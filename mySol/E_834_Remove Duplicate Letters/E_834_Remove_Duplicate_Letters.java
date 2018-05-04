/*
Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

Example
Given "bcabc"
Return "abc"

Given "cbacdcbc"
Return "acdb"
*/

import java.util.*;

public class E_834_Remove_Duplicate_Letters {

    public static void main(String[] args) {

        String input = "cbacdcbc";
        String output = removeDuplicateLetters(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: a string
     * @return: return a string
     */
    public static String removeDuplicateLetters(String s) {
        // write your code here
        int[] cnt = new int[26];
        boolean[] inStack = new boolean[26];
        char[] st = new char[s.length()];
        int len = 0;
        
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        for (char c : s.toCharArray()) {
            cnt[c - 'a']--;
            
            if (!inStack[c - 'a']) {
                while (len > 0 && c < st[len - 1] && cnt[st[len - 1] - 'a'] > 0) {
                    inStack[st[--len] - 'a'] = false;
                }
                
                st[len++] = c;
                inStack[c - 'a'] = true;
            }
        }
        
        return new String(st, 0, len);
    }

}
