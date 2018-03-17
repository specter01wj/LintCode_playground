/*
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.

Example
Given the string = "abcdzdcab", return "cdzdc".
*/

import java.util.*;

public class E_200_Longest_Palindromic_Substring {

    public static void main(String[] args) {

        String input = "abcdzdcab";
        String output = longestPalindrome(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public static String longestPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return "";
        }
        
        // abc => #a#b#c#
        String str = generateString(s);
        
        int[] palindrome = new int[str.length()];
        int mid = 0, longest = 1;
        palindrome[0] = 1;
        for (int i = 1; i < str.length(); i++) {
            int len = 1; 
            if (mid + longest > i) {
                int mirrorOfI = mid - (i - mid);
                len = Math.min(palindrome[mirrorOfI], mid + longest - i);
            }
            
            while (i + len < str.length() && i - len >= 0) {
                if (str.charAt(i - len) != str.charAt(i + len)) {
                    break;
                }
                len++;
            }
            
            if (len > longest) {
                longest = len;
                mid = i;
            }
            
            palindrome[i] = len;
        }
        
        longest = longest - 1; // remove the extra #
        int start = (mid - 1) / 2 - (longest - 1) / 2;
        return s.substring(start, start + longest);
    }
    
    private static String generateString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append('#');
        
        return sb.toString();
    }

}
