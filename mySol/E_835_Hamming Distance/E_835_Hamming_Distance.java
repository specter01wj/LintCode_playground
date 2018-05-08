/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

 Notice
0 ≤ x, y < 2^31.

Example
Input: x = 1, y = 4

Output: 2
*/

import java.util.*;

public class E_835_Hamming_Distance {

    public static void main(String[] args) {

        int input1 = 1;
        int input2 = 4;
        int output = hammingDistance(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param x: an integer
     * @param y: an integer
     * @return: return an integer, denote the Hamming Distance between two integers
     */
    public static int hammingDistance(int x, int y) {
        // write your code here
        int Distance=0;
        
        while ( x != 0 || y != 0 ) {
            if ( x % 2 != y % 2 ) {
                Distance ++;
            }
            x /= 2;
            y /= 2;
        }
        return Distance;
    }

}
