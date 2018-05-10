/*
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

 Notice
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.

Example
Given s = "aba" return true
Given s = "abca" return true // delete c
*/

import java.util.*;

public class E_891_Valid_Palindrome_II {

    public static void main(String[] args) {

        String input = "abca";
        boolean output = validPalindrome(input);
        System.out.println("input: " + (input) + "\noutput: " + output);

    }

    /**
     * @param s: a string
     * @return: nothing
     */
    public static boolean validPalindrome(String s) {
        // Write your code here
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left++;
            right--;
        }
        
        if (left >= right) {
            return true;
        }
        
        return isSubPalindrome(s, left + 1, right) || isSubPalindrome(s, left, right - 1);
    }
    
    private static boolean isSubPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

}
