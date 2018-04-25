/*
Given three integers a, b, c, return true if they can form a triangle.

 Notice
What is Triangle? (Wikipedia)

Example
Given a = 2, b = 3, c = 4
return true
Given a = 1, b = 2, c = 3
return false
*/

import java.util.*;

public class E_765_Valid_Triangle {

    public static void main(String[] args) {

        int input1 = 2, input2 = 3, input3 = 4;
        boolean output = isValidTriangle(input1, input2, input3);
        System.out.println("input: a = " + input1 + ", b = " + input2
        		+ ", c = " + input3 + "\noutput: " + output);

    }

    /**
     * @param a: a integer represent the length of one edge
     * @param b: a integer represent the length of one edge
     * @param c: a integer represent the length of one edge
     * @return: whether three edges can form a triangle
     */
    public static boolean isValidTriangle(int a, int b, int c) {
        // write your code here
        return (a + b > c && b + c > a && c + a > b);
    }

}
