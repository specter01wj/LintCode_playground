/*
Using O(1) time to check whether an integer n is a power of 2.

Example
For n=4, return true;

For n=5, return false;
*/

import java.util.*;

public class E_142_O1_Check_Power_of_2 {

    public static void main(String[] args) {

        int input = 64;
        boolean output = checkPowerOf2(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param n: An integer
     * @return: True or false
     */
    public static boolean checkPowerOf2(int n) {
        // write your code here
        long p = (long) n;
        return n != 0 && (p & (p - 1)) == 0;
    }

}
