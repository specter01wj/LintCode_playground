/*
Given a integer c, your task is to decide whether there're two integers a and b such that a^2 + b^2 = c.

Example
Given n = 5
Return true // 1 * 1 + 2 * 2 = 5

Given n = -5
Return false
*/

import java.util.*;

public class E_697_Check_Sum_of_Square_Numbers {

    public static void main(String[] args) {

        int input = 5;
        boolean output = checkSumOfSquareNumbers(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param num: the given number
     * @return: whether whether there're two integers
     */
    public static boolean checkSumOfSquareNumbers(int num) {
        // write your code here
        for (long a = 0; a * a <= num; a++) {
            double b = Math.sqrt(num - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    }

}
