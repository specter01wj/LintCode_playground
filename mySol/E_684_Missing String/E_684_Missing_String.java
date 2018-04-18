/*
Given two strings, you have to find the missing string.

Example
Given a string str1 = This is an example
Given another string str2 = is example

Return ["This", "an"]
*/

import java.util.*;

public class E_684_Missing_String {

    public static void main(String[] args) {

        String input1 = "This is an example";
        String input2 = "is example";
        List<String> output = missingString(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param str1: a given string
     * @param str2: another given string
     * @return: An array of missing string
     */
    public static List<String> missingString(String str1, String str2) {
        // Write your code here
        List<String> res = new ArrayList<>();
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        Set<String> set = new HashSet<>();
        
        for (String str : arr1) {
            set.add(str);
        }
        
        for (String str : arr2) {
            if (!set.contains(str)) {
                res.add(str);
            }
        }
        
        return res;
    }

}
