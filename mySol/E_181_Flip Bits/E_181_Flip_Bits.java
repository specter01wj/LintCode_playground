/*
Determine the number of bits required to flip if you want to convert integer n to integer m.

 Notice
Both n and m are 32-bit integers.

Example
Given n = 31 (11111), m = 14 (01110), return 2.
*/

import java.util.*;

public class E_181_Flip_Bits {

    public static void main(String[] args) {

        int input1 = 31;
        int input2 = 14;
        int output = bitSwapRequired(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /*
     * @param a: An integer
     * @param b: An integer
     * @return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int c = a ^ b;
        int cnt = 0;
        while (c != 0) {
            c &= c - 1;
            cnt++;
        }
        return cnt;
    }

}
