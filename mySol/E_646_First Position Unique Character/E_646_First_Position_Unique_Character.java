/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Example
Given s = "lintcode", return 0.

Given s = "lovelintcode", return 2.
*/

import java.util.*;

public class E_646_First_Position_Unique_Character {

    public static void main(String[] args) {

        String input = "lovelintcode";
        int output = firstUniqChar(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: a string
     * @return: it's index
     */
    public static int firstUniqChar(String s) {
        // write your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            map.put(c, map.containsKey(c) ? map.get(c) + 1: 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) < 2) {
                return i;
            }
        }
        return -1;
    }

}
