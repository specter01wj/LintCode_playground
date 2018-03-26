/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example
Given num = 38.
The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return 2.
*/

import java.util.*;

public class E_569_Add_Digits {

    public static void main(String[] args) {

        int input = 38;
        int output = addDigits(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param num: a non-negative integer
     * @return: one digit
     */
    public static int addDigits(int num) {
        // write your code here
        return 1 + (num - 1) % 9;
    }

}
