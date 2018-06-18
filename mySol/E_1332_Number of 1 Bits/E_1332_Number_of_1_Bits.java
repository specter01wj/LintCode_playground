/*
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

Example
For example, the 32-bit integer 11 has binary representation 00000000000000000000000000001011, so the function should return 3.
*/

import java.util.*;

public class E_1332_Number_of_1_Bits {

    public static void main(String[] args) {

        int input = 11;
        int output = hammingWeight(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param n: an unsigned integer
     * @return: the number of â€™1' bits
     */
    public static int hammingWeight(int n) {
        // write your code here
        if (n == 0) {
            return 0;
        }
        
        int count = 1;
        while ((n & (n - 1)) != 0) {
            n &= n-1;
            count++;
        }
        return count;
    }

}
