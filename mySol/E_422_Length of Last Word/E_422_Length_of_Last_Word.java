/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

 Notice
A word is defined as a character sequence consists of non-space characters only.

Example
Given s = "Hello World", return 5.
*/

import java.util.*;

public class E_422_Length_of_Last_Word {

    public static void main(String[] args) {

        String input = "Hello World";
        int output = lengthOfLastWord(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: A string
     * @return: the length of last word
     */
    public static int lengthOfLastWord(String s) {
        // write your code here
        char[] c = s.trim().toCharArray();
        int i = c.length - 1;
        int len = 0;

        while (i >= 0 && c[i] != ' ') {
            i--;
            len++;
        }
        return len;
    }

}
