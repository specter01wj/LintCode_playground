/*
Given a sentence of English, update the first letter of each word to uppercase.

Example
Given s = "i want to get an accepted", return "I Want To Get An Accepted".
*/

import java.util.*;

public class E_936_Capitalizes_The_First_Letter {

    public static void main(String[] args) {

        String input = "i want to get an accepted";
        String output = capitalizesFirst(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: a string
     * @return: a string after capitalizes the first letter
     */
    public static String capitalizesFirst(String s) {
        // Write your code here
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (i == 0 && str[i] != ' ') {
                str[i] = Character.toUpperCase(str[i]);
            }
            
            if (i != 0 && str[i] != ' ' && str[i - 1] == ' ') {
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        return new String(str);
    }

}
