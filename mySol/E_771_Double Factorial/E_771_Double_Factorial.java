/*
Given a number n, return the double factorial of the number.In mathematics, the product of all the integers from 1 up to some non-negative integer n that have the same parity (odd or even) as n is called the double factorial.

Example
Given n = 5, return 15.

Explanation:
5!! = 5 * 3 * 1 = 15
Given n = 6, return 24.

Explanation:
6!! = 6 * 4 * 2 = 24
*/

import java.util.*;

public class E_771_Double_Factorial {

    public static void main(String[] args) {

        int input = 5;
        long output = doubleFactorial(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: the given number
     * @return:  the double factorial of the number
     */
    public static long doubleFactorial(int n) {
        // Write your code here
        return calc(n);
    }
    
    long calc(int n) {
        if (n <= 1) {
            return 1;
        }
        
        return calc(n - 2) * n;
    }

}
