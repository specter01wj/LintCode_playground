/*
Given a string, sort the string with the first keyword which is the most commonly used characters and the second keyword which is the dictionary order.

 Notice
The length of string is less than 10000.
All characters are lowercase

Example
Given str = “bloomberg”, return “bbooeglmr”.

Explanation:
'b' appears the most frequently, and the dictionary sequence is the smallest, so it is ranked first, followed by 'o'.
Given str = “lintcode”, return “cdeilnot”.

Explanation:
All characters appear the same number of times, so directly in accordance with the dictionary order.
*/

import java.util.*;

public class E_830_String_Sort {

    public static void main(String[] args) {

        String input = "bloomberg";
        String output = stringSort(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param str: the string that needs to be sorted
     * @return: sorted string
     */
    static int[] count = new int[26];
    
    public static String stringSort(String str) {
        // Write your code here
        for (int i = 0; i < 26; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            count[(int)str.charAt(i) - (int)('a')]++;
        }
        Pair[] pair = new Pair[str.length()];
        for (int i = 0; i < str.length(); i++) {
            pair[i] = new Pair();
            pair[i].cnt = count[(int)str.charAt(i) - (int)('a')];
            pair[i].order = (int)str.charAt(i);
        }
        Arrays.sort(pair, 0, pair.length, new Cmp());
        char[] chr = new char[pair.length];
        for (int i = 0; i < pair.length; i++) {
            chr[i] = (char)pair[i].order;
        }
        return String.valueOf(chr);
    }

}

class Pair {
    int cnt, order;
}

class Cmp implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        if (a.cnt != b.cnt) {
            return a.cnt > b.cnt ? -1 : 1;
        }
        if (a.order != b.order) {
            return a.order < b.order ? -1 : 1;
        }
        return 0;
    }
}