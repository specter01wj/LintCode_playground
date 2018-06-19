/*
Given a string s of only 'A' and 'B', find the longest substring that satisfies the number of 'A' and 'B' are the same. Please output the length of this substring.

Example
Given s = "ABAAABBBA", return 8.

Explanation:
Substring s[0,7] and s[1,8] meet the conditions, their length is 8.
Given s = "AAAAAA", return 0.

Explanation:
No substring satisfies the condition except empty substring.
*/

import java.util.*;

public class E_1443_Longest_AB_Substring {

    public static void main(String[] args) {

        String input = "ABAAABBBA";
        int output = getAns(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param S: a String consists of a and b
     * @return: the longest of the longest string that meets the condition
     */
    public static int getAns(String s) {
        // Write your code here
        int len = s.length();
        int dp[] = new int[len + 1];
        dp[1] = (s.charAt(0) - 'A') == 1 ? 1 : -1;
        for (int i = 2; i <= len; i++) {
            dp[i] = (s.charAt(i - 1) - 'A') == 1 ? 1 : -1;
            dp[i] += dp[i - 1];
        }
        int max = 0, begin;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 1; i <= len; i++) {
            begin = m.getOrDefault(dp[i], 0);
            if (begin == 0 && dp[i] != 0) {
                m.put(dp[i], i);
            } else {
                if (i - begin > max) {
                    max = i - begin;
                }
            }
        }
        return max;
    }

}
