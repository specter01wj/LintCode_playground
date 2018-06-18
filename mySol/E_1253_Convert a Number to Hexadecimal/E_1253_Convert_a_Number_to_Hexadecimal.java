/*
Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Example
Example 1:

Input:
26

Output:
"1a"
Example 2:

Input:
-1

Output:
"ffffffff"
*/

import java.util.*;

public class E_1253_Convert_a_Number_to_Hexadecimal {

    public static void main(String[] args) {

        int input = 26;
        String output = toHex(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param num: an integer
     * @return: convert the integer to hexadecimal
     */
    public static String toHex(int num) {
        // Write your code here
        if(num == 0) {
            return "0";
        }
        String ans = "";
        int len = 0;
        while(num != 0 && len < 8) {
            int bit = num & 15;
            if(bit < 10) {
                ans = (char)('0' + bit) + ans;
            }
            else {
                ans = (char)('a' + bit - 10) + ans;
            }
            num >>= 4;
            len++;
        }
        return ans;
    }

}
