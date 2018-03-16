/*
Write an algorithm to determine if a number is happy.

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example
19 is a happy number

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

import java.util.*;

public class E_488_Happy_Number {

    public static void main(String[] args) {

        int input = 19;
        boolean output = isHappy(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    public static boolean isHappy(int n) {
        // write your code here
        Set<Integer> known = new HashSet<>();

        while (true) {
            if (n == 1) {
                return true;
            }

            known.add(n);
            n = getSum(n);
            if (known.contains(n)) {
                return false;
            }
        }
    }
    
    private static int getSum(int n) {
        int s = 0;
        while (n > 0) {
            s += Math.pow(n % 10, 2);
            n /= 10;
        }
        return s;
    }

}
