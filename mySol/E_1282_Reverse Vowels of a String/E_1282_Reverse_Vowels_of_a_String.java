/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example
Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "lintcode", return "lentcodi".
*/

import java.util.*;

public class E_1282_Reverse_Vowels_of_a_String {

    public static void main(String[] args) {

        String input = "hello";
        String output = reverseVowels(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param s: a string
     * @return: reverse only the vowels of a string
     */
    public static String reverseVowels(String s) {
        // write your code here
        int[] pos = new int[s.length()];
        int cnt = 0;
        HashSet<Character> vowel = new HashSet<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        
        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i))) {
                pos[cnt] = i;
                cnt++;
            }
        }
        
        char[] ans = new char[s.length()];
        ans = s.toCharArray();
        for (int i = 0; i < cnt; i++) {
            ans[pos[i]] = s.charAt(pos[cnt - i - 1]);
        }
        return String.valueOf(ans);
    }

}
