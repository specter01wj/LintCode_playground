/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
*/

import java.util.*;

public class E_53_Reverse_Words_in_a_String {

    public static void main(String[] args) {

        String input = "the sky is blue";
        String output = reverseWords(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param s: A string
     * @return: A string
     */
    public static String reverseWords(String s) {
        // write your code here
        
        char[] c = s.toCharArray();
        int start = 0, end = 0;

        while(end < c.length) {
            while(end < c.length && c[end] != ' ') {
                end++;
            }
            reverse(c, start, end - 1);
            start = end + 1;
            end++;
        }
        reverse(c, 0, c.length - 1);

        return new String(c).trim();
    }

    private static void reverse(char[] c, int start, int end) {
        while(start < end) {
            char tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
            start++;
            end--;
        }
    }

}
