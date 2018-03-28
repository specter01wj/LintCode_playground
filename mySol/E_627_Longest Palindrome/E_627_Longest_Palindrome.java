/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

 Notice
Assume the length of given string will not exceed 1010.

Example
Given s = "abccccdd" return 7

One longest palindrome that can be built is "dccaccd", whose length is 7.
*/

import java.util.*;

public class E_627_Longest_Palindrome {

    public static void main(String[] args) {

        String input = "abccccdd";
        int output = longestPalindrome(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public static int longestPalindrome(String s) {
        // write your code here
        HashSet<Character> A = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (A.contains(ch)) {
                A.remove(ch);
            }
            else {
                A.add(ch);
            }
        }
        return A.isEmpty() ? s.length() : s.length() - A.size() + 1;
    }

}
