/*
Given two strings, write a method to decide if one is a permutation of the other.

Example
abcd is a permutation of bcad, but abbe is not a permutation of abe
*/

import java.util.*;

public class E_211_String_Permutation {

    public static void main(String[] args) {

        String input1 = "a2q3";
        String input2 = "qa23";
        boolean output = Permutation(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /*
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public static boolean Permutation(String A, String B) {
        // write your code here
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b));
    }

}
