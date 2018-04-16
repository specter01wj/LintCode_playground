/*
Give a string, you can choose to split the string after one character or two adjacent characters, and make the string to be composed of only one character or two characters. Output all possible results.

Example
Given the string "123"
return [["1","2","3"],["12","3"],["1","23"]]
*/

import java.util.*;

public class E_680_Split_String {

    public static void main(String[] args) {

        String input = "123";
        List<List<String>> output = splitString(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param : a string to be split
     * @return: all possible split string array
     */
    public static List<List<String>> splitString(String s) {
        // write your code here
        List<List<String>> results = new ArrayList<>();
        if (s == null) {
            return results;
        } else if (s.length() == 0) {
            results.add(new ArrayList<>());
            return results;
        }
        
        dfsHelper(results, new ArrayList<>(), 0, s);
        
        return results;
    }
    
    private static void dfsHelper(List<List<String>> results,
                           List<String> result,
                           int index,
                           String s) {
        if (index == s.length()) {
            results.add(new ArrayList<>(result));
            return;
        }
        
        for (int i = index; i < index + 2 && i < s.length(); i++) {
            String substring = s.substring(index, i + 1);
            result.add(substring);
            dfsHelper(results, result, i + 1, s);
            result.remove(result.size() - 1);
        }
    }

}
