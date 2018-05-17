/*
Given a string str, we need to extract the symbols and words of the string in order.

 Notice
The length of str does not exceed 10000.
The given str contains only lowercase letters, symbols, and spaces.

Example
Given str = "(hi (i am)bye)"，return ["(","hi","(","i","am",")","bye",")"].

Explanation:
Separate symbols and words.
Given str = "#ok yes"，return ["#","ok","yes"]。

Explanation:
Separate symbols and words.
Given str = "##s"，return ["#","#","s"]。

Explanation:
Separate symbols and words.
*/

import java.util.*;

public class E_956_Data_Segmentation {

    public static void main(String[] args) {

        String input = "(hi (i am)bye)";
        String[] output = dataSegmentation(input);
        System.out.println("input: " + (input) + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param str: The input string
     * @return: The answer
     */
    public static String[] dataSegmentation(String str) {
        // Write your code here
        ArrayList<String> ans = new ArrayList<String>();
        StringBuilder tmp = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                if(tmp.length() != 0) {
                    ans.add(tmp.toString());
                }
                tmp = new StringBuilder("");
                continue;
            }
            else if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                if(tmp.length() != 0) {
                    ans.add(tmp.toString());
                }
                tmp = new StringBuilder("");
                tmp.append(str.charAt(i));
                ans.add(tmp.toString());
                tmp = new StringBuilder("");
            }
            else {
                tmp.append(str.charAt(i));
            }
        }
        if(tmp.length() != 0) {
            ans.add(tmp.toString());
        }
        String[] res = ans.toArray(new String[ans.size()]);
        return res;
    }

}
