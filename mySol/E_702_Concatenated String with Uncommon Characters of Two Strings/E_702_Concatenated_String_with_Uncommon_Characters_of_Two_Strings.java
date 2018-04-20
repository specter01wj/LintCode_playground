/*
Two strings are given and you have to modify 1st string such that all the common characters of the 2nd strings have to be removed and the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.

Example
Given s1 = aacdb, s2 = gafd
return cbgf

Given s1 = abcs, s2 = cxzca;
return bsxz
*/

import java.util.*;

public class E_702_Concatenated_String_with_Uncommon_Characters_of_Two_Strings {

    public static void main(String[] args) {

        String input1 = "aacdb";
        String input2 = "gafd";
        String output = concatenetedString(input1, input2);
        System.out.println("input1: " + input1 + " input2: " + input2 + "\noutput: " + output);

    }

    /*
     * @param : the 1st string
     * @param : the 2nd string
     * @return: uncommon characters of given strings
     */
    public static String concatenetedString(String s1, String s2) {
        // write your code here
        if(s1 == null){
            return s2;
        }
        if(s2 == null){
            return s1;
        }
        
        int[] map = new int[126];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s2.length(); i++){
            map[s2.charAt(i)] = 1;
        }
        
        for(int i = 0; i < s1.length(); i++){
            if(map[s1.charAt(i)] == 0){
                sb.append(s1.charAt(i));
            }else{
                map[s1.charAt(i)] = 2;
            }
        }
        
        for(int i = 0; i < s2.length(); i++){
            if(map[s2.charAt(i)] == 1){
                sb.append(s2.charAt(i));
            }
        }
        return sb.toString();
    }

}
