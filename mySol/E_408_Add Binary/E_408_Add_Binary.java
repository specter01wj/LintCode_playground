/*
Given two binary strings, return their sum (also a binary string).

Example
a = 11

b = 1

Return 100
*/

import java.util.*;

public class E_408_Add_Binary {

    public static void main(String[] args) {

        String input1 = "11";
        String input2 = "1";
        String output = addBinary(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public static String addBinary(String a, String b) {
        String ans = "";

        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            sum += (i >= 0) ? a.charAt(i) - '0' : 0;
            sum += (j >= 0) ? b.charAt(j) - '0' : 0;
            ans = (sum % 2) + ans;
            carry = sum / 2;
        }
        if (carry != 0) {
            ans = carry + ans;
        }
        return ans;
    }

}
