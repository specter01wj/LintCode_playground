/*
There is a data stream, one letter at a time, and determine whether the current stream's arrangement can form a palindrome.

 Notice
1 <= |s| <= 10^5

Example
Given s = ['a','a','a','a','a'], return [1,1,1,1,1].

Explanation:
“a” can form a palindrome
“aa” can form a palindrome
“aaa” can form a palindrome
“aaaa” can form a palindrome
“aaaaa” can form a palindrome
Given s = ['a','b','a']，return [1,0,1].

Explanation:
“a” can form a palindrome
“ab” can't form a palindrome
“aba” can form a palindrome
*/

import java.util.*;

public class E_958_Palindrome_Data_Stream {

    public static void main(String[] args) {

        String input = "aba";
        int[] output = getStream(input);
        System.out.println("input: " + (input) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param s: The data stream
     * @return: Return the judgement stream
     */
    public static int[] getStream(String s) {
        // Write your code here
        int [] ans = new int[s.length()];
        int [] alphabet = new int[26];
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alphabet[c - 'a'] % 2 == 1) {
                cnt--;
                alphabet[c - 'a']++;
            } else {
                cnt++;
                alphabet[c - 'a']++;
            }
            if (cnt > 1) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }
        return ans;
    }

}
