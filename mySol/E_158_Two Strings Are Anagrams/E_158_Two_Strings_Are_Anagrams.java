/*
Write a method anagram(s,t) to decide if two strings are anagrams or not.

Clarification
What is Anagram?
- Two strings are anagram if they can be the same after change the order of characters.

Example
Given s = "abcd", t = "dcab", return true.
Given s = "ab", t = "ab", return true.
Given s = "ab", t = "ac", return false.
*/

import java.util.*;

public class E_158_Two_Strings_Are_Anagrams {

    public static void main(String[] args) {

        String input1 = "abcd";
        String input2 = "dcba";
        boolean output = anagram(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {
        // write your code here
        if (s == null || t == null) {
            return false;
        }

        int[] cnt = new int[256];

        int sizeS = s.length();
        int sizeT = t.length();
        if (sizeS != sizeT) {
            return false;
        }
        for (int i = 0; i < sizeS; i++) {
            if (s.charAt(i) != ' ') {
                cnt[s.charAt(i)]++;
            }
        }

        for (int i = 0; i < sizeT; i++) {
            if (t.charAt(i) != ' ') {
                cnt[t.charAt(i)]--;
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                return false;
            }
        }

        return true;
    }

}
