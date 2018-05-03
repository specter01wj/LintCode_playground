/*
Give two input stream inputA and inputB, which have Backspace. If the final result of the two input streams is equal, output YES, otherwise output NO.

 Notice
Input characters include only lowercase letters and '<'
The length of input stream does not exceed 10000.

Example
Given inputA = “abcde<<”, inputB = “abcd<e<”, return "YES".

Explanation:
The final result of inputA and inputB is abc, so return "YES".
Given inputA = “a<<bc”, inputB = “abc<”, return "NO"

Explanation:
The final result of inputA is "bc", and the final result of inputB is "ab", so return "NO".
*/

import java.util.*;

public class E_823_Input_Stream {

    public static void main(String[] args) {

        String input1 = "abcde<<";
        String input2 = "abcd<e<";
        String output = inputStream(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param inputA: Input stream A
     * @param inputB: Input stream B
     * @return: The answer
     */
    public static String inputStream(String inputA, String inputB) {
        // Write your code here
        char[] A = new char[inputA.length()];
        int lenA = 0;
        for (int i = 0; i < inputA.length(); i++) {
            if (inputA.charAt(i) == '<') {
                if (lenA > 0) {
                    lenA--;
                }
            } else {
                A[lenA++] = inputA.charAt(i);
            }
        }
        char[] B = new char[inputB.length()];
        int lenB = 0;
        for (int i = 0; i < inputB.length(); i++) {
            if (inputB.charAt(i) == '<') {
                if (lenB > 0) {
                    lenB--;
                }
            } else {
                B[lenB++] = inputB.charAt(i);
            }
        }
        if (lenA == lenB) {
            for (int i = 0; i < lenA; i++) {
                if (A[i] != B[i]) {
                    return "NO";
                }
            }
            return "YES";
        }
        return "NO";
    }

}
