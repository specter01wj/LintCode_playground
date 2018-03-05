/*
Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).

Example
Given x = 123, return 321

Given x = -123, return -321
*/

import java.util.*;

public class E_413_Reverse_Integer {

    public static void main(String[] args) {

        int input = 123;
        int output = reverseInteger(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public static int reverseInteger(int n) {
        // write your code here
        int reversed_n = 0;
        
        while (n != 0) {
            int temp = reversed_n * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != reversed_n) {
                reversed_n = 0;
                break;
            }
            reversed_n = temp;
        }
        return reversed_n;
    }

}
