/*
Compare two strings A and B, determine whether A contains all of the characters in B.

The characters in string A and B are all Upper Case letters.

 Notice
The characters of B in A are not necessary continuous or ordered.

Example
For A = "ABCD", B = "ACD", return true.

For A = "ABCD", B = "AABC", return false.
*/

import java.util.*;

public class E_55_Compare_Strings {

    public static void main(String[] args) {

        String input1 = "ABCD";
        String input2 = "ACD";
        boolean output = compareStrings(input1, input2);
        System.out.println("input: " + input1 + " and " + input2 + "\noutput: " + output);

    }

    /*
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public static boolean compareStrings(String A, String B) {
        // write your code here
        int[] cnt = new int[26];

        for(char c : A.toCharArray()) {
            cnt[c - 'A']++;
        }

        for(char b : B.toCharArray()) {
            if(cnt[b - 'A'] == 0) {
                return false;
            }
            cnt[b - 'A']--;
        }

        return true;
    }

}
