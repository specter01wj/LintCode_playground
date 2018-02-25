/*
Write a method to replace all spaces in a string with %20. The string is given in a characters array, you can assume it has enough space for replacement and you are given the true length of the string.

You code should also return the new length of the string after replacement.

 Notice
If you are using Java or Python，please use characters array instead of string.

Example
Given "Mr John Smith", length = 13.

The string after replacement should be "Mr%20John%20Smith", you need to change the string in-place and return the new length 17.
*/

import java.util.*;

public class E_212_Space_Replacement {

    public static void main(String[] args) {

        String input = "Mr John Smith";
        char[] char_input = input.toCharArray();
        int len = 13;
        int output = replaceBlank(char_input, len);
        System.out.println("input: " + input + " length: " + len + "\noutput: " + output);

    }

    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public static int replaceBlank(char[] string, int length) {
        // write your code here
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                length += 2;
                for (int j = length - 1; j > i + 2; j--) {
                    string[j] = string[j - 2];
                }
                string[i] = '%';
                string[i + 1] = '2';
                string[i + 2] = '0';
            }
        }
        return length;
    }

}
