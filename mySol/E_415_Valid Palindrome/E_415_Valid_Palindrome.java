/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 Notice
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

Example
"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.
*/

import java.util.*;

public class E_415_Valid_Palindrome {

    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";
        boolean output = isPalindrome(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public static boolean isPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return true;
        }

        int front = 0;
        int end = s.length() - 1;
        while (front < end) {
            while (front < s.length() && !isvalid(s.charAt(front))){ // nead to check range of a/b
                front++;
            }

            if (front == s.length()) { // for emtpy string “.,,,”     
                return true; 
            }           

            while (end >= 0 && ! isvalid(s.charAt(end))) { // same here, need to check border of a,b
                end--;
            }

            if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))) {
                break;
            } else {
                front++;
                end--;
            }
        }

        return end <= front; 
    }
    
    private static boolean isvalid (char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

}
