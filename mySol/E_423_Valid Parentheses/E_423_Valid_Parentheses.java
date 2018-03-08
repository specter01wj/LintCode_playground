/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Example
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

import java.util.*;

public class E_423_Valid_Parentheses {

    public static void main(String[] args) {

        String input = "([]{)}";
        boolean output = isValidParentheses(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public static boolean isValidParentheses(String s) {
        // write your code here
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if ("({[".contains(String.valueOf(c))) {
                stack.push(c);
            } else {
               if (!stack.isEmpty() && is_valid(stack.peek(), c)) {
                   stack.pop();
               } else {
                   return false;
               }
           }
        }
        return stack.isEmpty();
    }
    
    private static boolean is_valid(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}')
            || (c1 == '[' && c2 == ']');
    }

}
