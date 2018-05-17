/*
Given a decimal number n and an integer k, Convert decimal number n to base-k.

 Notice
1.0<=n<=2^31-1, 2<=k<=16
2.Each letter over 9 is indicated in uppercase

Example
Example 1:
Given n = 5, k = 2
return "101"

Example 2:
Given n = 30, k = 16
return "1E"
*/

import java.util.*;

public class N_763_Hex_Conversion {

    public static void main(String[] args) {

        int input = 5, k = 2;
        String output = hexConversion(input, k);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public static String hexConversion(int n, int k) {
        // write your code here
        String res = "";
        if (n == 0) {
            return "0";
        }
        
        while (n > 0) {
            int t = n % k;
            char c = ' ';
            if (t <= 9) {
                c = (char)('0' + t);
            }
            else {
                c = (char)('A' + (t - 10));
            }
            
            res = c + res;
            n /= k;
        }
        
        return res;
    }

}
