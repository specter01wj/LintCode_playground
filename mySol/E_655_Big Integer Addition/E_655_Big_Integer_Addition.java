/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

 Notice
The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example
Given num1 = "123", num2 = "45"
return "168"
*/

import java.util.*;

public class E_655_Big_Integer_Addition {

    public static void main(String[] args) {

        String input1 = "123";
        String input2 = "45";
        String output = addStrings(input1, input2);
        System.out.println("input1: " + input1 + " | input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public static String addStrings(String num1, String num2) {
        // write your code here
        int[] a = convert(num1);
        int[] b = convert(num2);
        int[] sum = new int[Math.max(a.length, b.length) + 1];
        int carry = 0;
        int index = sum.length - 1;
        int i = 0;
        int j = 0;
        while (index >= 0) {
            if (i < a.length) {
                carry += a[i++];
            }
            if (j < b.length) {
                carry += b[j++];
            }
            sum[index--] = carry % 10;
            carry /= 10;
        }
        StringBuilder sb = new StringBuilder(sum.length);
        for (i = (sum[0] == 0? 1 : 0); i < sum.length; ++i) {
            sb.append(sum[i]);
        }
        return sb.toString();
    }
    
    private static int[] convert(String num) {
        char[] digits = num.toCharArray();
        int[] number = new int[digits.length];
        int index = number.length - 1;
        for (char digit : digits) {
            number[index--] = digit - '0';
        }
        return number;
    }

}
