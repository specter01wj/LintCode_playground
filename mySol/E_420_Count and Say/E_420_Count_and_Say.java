/*
The count-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.

11 is read off as "two 1s" or 21.

21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth sequence.

 Notice
The sequence of integers will be represented as a string.

Example
Given n = 5, return "111221".
*/

import java.util.*;

public class E_420_Count_and_Say {

    public static void main(String[] args) {

        int input = 5;
        String output = countAndSay(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public static String countAndSay(int n) {
        // write your code here
        String oldString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char [] oldChars = oldString.toCharArray();

            for (int i = 0; i < oldChars.length; i++) {
                int count = 1;
                while ((i+1) < oldChars.length && oldChars[i] == oldChars[i+1]) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
            }
            oldString = sb.toString();
        }

        return oldString;
    }

}
