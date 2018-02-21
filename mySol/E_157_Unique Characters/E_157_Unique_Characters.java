/*
Implement an algorithm to determine if a string has all unique characters.

Example
Given "abc", return true.

Given "aab", return false.
*/

import java.util.*;

public class E_157_Unique_Characters {

    public static void main(String[] args) {

        String input = "abcd";
        boolean output = isUnique(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param str: A string
     * @return: a boolean
     */
    public static boolean isUnique(String str) {
        // write your code here
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

}
