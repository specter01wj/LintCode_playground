/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:

Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"

Output: False
Example 3:

Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
*/

import java.util.*;

public class E_1227_Repeated_Substring_Pattern {

    public static void main(String[] args) {

        String input = "abab";
        boolean output = repeatedSubstringPattern(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param s: a string
     * @return: return a boolean
     */
    public static boolean repeatedSubstringPattern(String s) {
        // write your code here
        int l = s.length();
        int[] next = new int[l];
        next[0] = -1;
        int i, j = -1;
        for (i = 1; i < l; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
        int lenSub = l - 1 - next[l - 1];
        return lenSub != l && l % lenSub ==0;
    }

}
