/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 Notice
You may assume both s and t have the same length.

Example
Given s = "egg", t = "add", return true.

Given s = "foo", t = "bar", return false.

Given s = "paper", t = "title", return true.
*/

import java.util.*;

public class E_638_Strings_Homomorphism {

    public static void main(String[] args) {

        String input1 = "paper";
        String input2 = "title";
        boolean output = isIsomorphic(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public static boolean isIsomorphic(String s, String t) {
        // write your code here
        HashMap<Character , Character> record = new HashMap<>();  
        HashSet<Character> repeat = new HashSet<>();  
        for(int i = 0;i<s.length();i++){  
            if(!record.containsKey(s.charAt(i))){  
                if(repeat.contains(t.charAt(i))){  
                    return false;  
                }  
                record.put(s.charAt(i) , t.charAt(i));  
                repeat.add(t.charAt(i));  
            }else{  
                if(record.get(s.charAt(i)) != t.charAt(i)){  
                    return false;  
                }  
            }  
        }  
        return true; 
    }

}
