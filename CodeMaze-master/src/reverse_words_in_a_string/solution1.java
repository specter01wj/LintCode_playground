public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        int l = s.length();
        int startIndex = 0;
        int nextSpaceIndex;
        while (startIndex != -1 && startIndex < l) {
            while (startIndex < l && s.charAt(startIndex) == ' ') {
                startIndex++;
            }
            if (startIndex >= l) break;
            
            nextSpaceIndex = s.indexOf(' ', startIndex);
            if (nextSpaceIndex != -1) {
                stack.push(s.substring(startIndex, nextSpaceIndex));
            } else {
                stack.push(s.substring(startIndex));
                break;
            }
            startIndex = nextSpaceIndex;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                sb.append(stack.pop());
            } else {
                sb.append(stack.pop() + " ");
            }
        }
        
        return sb.toString();
    }
}