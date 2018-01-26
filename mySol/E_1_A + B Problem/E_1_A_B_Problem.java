/*
Write a function that add two numbers A and B. You should not use + or any arithmetic operators.

Example
Given a=1 and b=2 return 3
*/

/*
Also on LeetCode: Sum of Two Integers. https://leetcode.com/problems/sum-of-two-integers/
*/


import java.util.*;

public class E_1_A_B_Problem {

    public static void main(String[] args) {

        int input1 = 10, input2 = 8;
        int output = aplusb(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /*
    sol1:
    Wring down truth table for a and b:
    a + b on each bit becomes OR operation, exception when they are both 1, where they becomes 0 and add forward to next bit.
    - We can use a carryOver
    - Use long to hold the result
    */

    /*
     * @param A: an integer array
     * @return: 
     */
    /*public static int aplusb(int a, int b) {
        // write your code here
        int sum = a ^ b; // incomplete sum
        int nextCarry = (a & b) << 1;
        while (nextCarry != 0) {
            int currentCarry = sum & nextCarry;
            sum = sum ^ nextCarry;
            nextCarry = currentCarry << 1;
        }
        return sum;
    }*/

    /*
    sol2:
        Bit operation. Just to remmeber this problem, doing A+B using bit.
    */
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public static int aplusb(int a, int b) {
        // write your code here
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

}
