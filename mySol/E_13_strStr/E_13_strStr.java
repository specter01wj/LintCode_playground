/*
For a given source string and a target string, you should output the first index(from 0) of target string in source string.

If target does not exist in source, just return -1.

Clarification
Do I need to implement KMP Algorithm in a real interview?

Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure you confirm with the interviewer first.
Example
If source = "source" and target = "target", return -1.

If source = "abcdabcdefg" and target = "bcd", return 1.
*/

import java.util.*;

public class E_13_strStr {

    public static void main(String[] args) {

        String input1 = "abcdabcdefg";
        String input2 = "bcd";
        int output = strStr(input1, input2);
        System.out.println("input: " + input1 + " and " + input2 + "\noutput: " + output);

    }

    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public static int strStr(String source, String target) {
        // write your code here
        if (source == null || target == null) return -1;
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();
        if (t.length == 0) return 0;
        int i, j;
        for (i = 0; i < s.length; i++) {
            for (j = 0; j < t.length; j++) {
                if (i + j >= s.length || s[i + j] != t[j]) {
                    break;
                }
            }
            if (j == t.length) return i;
        }

        return -1;
    }

}
