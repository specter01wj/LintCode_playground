/*
Input two strings s and t，determine if s can get t after deleting some characters.

Example
Given s="abc", t="c" , return True.

Explanation:
s delete 'a' and 'b' to get t.
Given s="a", t="c" , return False.

Explanation:
s cannot get t after deleting some characters.
*/

import java.util.*;

public class E_1445_Delete_Characters {

    public static void main(String[] args) {

        String input1 = "abc", input2 = "c";
        boolean output = canGetString(input1, input2);
        System.out.println("input1: " + (input1) + " input2: " + (input2) + "\noutput: " + (output));

    }

    /**
     * @param s: The string s
     * @param t: The string t
     * @return: Return if can get the string t
     */
    public static boolean canGetString(String s, String t) {
        // Write your code here
        int n = s.length(), m = t.length();
        int cnt = 0, i;
        for(i = 0; i < n; i++) {
            if(s.charAt(i) == t.charAt(cnt))cnt++;
            if(cnt == m)break;
        }
        if(cnt == m)return true;
        else return false;
    }

}
