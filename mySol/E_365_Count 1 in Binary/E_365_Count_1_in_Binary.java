/*
Count how many 1 in binary representation of a 32-bit integer.

Example
Given 32, return 1

Given 5, return 2

Given 1023, return 9
*/

import java.util.*;

public class E_365_Count_1_in_Binary {

    public static void main(String[] args) {

        int input = 5;
        int output = countOnes(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param num: An integer
     * @return: An integer
     */
    public static int countOnes(int num) {
        // write your code here
        int cnt = 0;
        while (num != 0) {
            num &= num - 1;
            cnt++;
        }
        return cnt;
    }

}
