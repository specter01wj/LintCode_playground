class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; ++i) {
            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') stack.push(charArray[i]);
            else if (charArray[i] == ')' || charArray[i] == '}' || charArray[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (c == '(' && charArray[i] != ')') return false;
                else if (c == '[' && charArray[i] != ']') return false;
                else if (c == '{' && charArray[i] != '}') return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}