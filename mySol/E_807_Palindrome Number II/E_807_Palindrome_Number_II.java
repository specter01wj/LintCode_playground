/*
Determines whether a binary representation of a non-negative integer n is a palindrome

 Notice
0 <= n <= 2^32 - 1

Example
Given n = 0, return True

Explanation:
The binary representation of 0 is: 0
Given n = 3, return True

Explanation:
The binary representation of 3 is: 11
Given n = 4, return False

Explanation:
The binary representation of 4 is: 100
Given n = 6, return False

Explanation:
The binary representation of 6 is: 110
*/

import java.util.*;

public class E_807_Palindrome_Number_II {

    public static void main(String[] args) {

        int input = 6;
        boolean output = isPalindrome(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: non-negative integer n.
     * @return: return whether a binary representation of a non-negative integer n is a palindrome.
     */
    public static boolean isPalindrome(int n) {
        // Write your code here
        int[] bin = new int[32];
        int len = 0;
        do {
            bin[len++] = n & 1;
            n >>= 1;
        } while (n > 0);
        for (int i = 0; i < len / 2; i++) {
            if (bin[i] != bin[len - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
