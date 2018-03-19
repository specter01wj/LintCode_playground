/*
Check a positive number is a palindrome or not.

A palindrome number is that if you reverse the whole number you will get exactly the same number.

 Notice
It's guaranteed the input number is a 32-bit integer, but after reversion, the number may exceed the 32-bit integer.

Example
11, 121, 1, 12321 are palindrome numbers.

23, 32, 1232 are not palindrome numbers.
*/

import java.util.*;

public class E_491_Palindrome_Number {

    public static void main(String[] args) {

        int input = 12321;
        boolean output = isPalindrome(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public static boolean isPalindrome(int num) {
        // write your code here
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}
