/*
You know what, left pad is javascript package and referenced by React: 
Github link

One day his author unpublished it, then a lot of javascript projects in the world broken.

You can see from github it's only 11 lines.

You job is to implement the left pad function. If you do not know what left pad does, see examples below and guess.

Example
leftpad("foo", 5)
>> "  foo"

leftpad("foobar", 6)
>> "foobar"

leftpad("1", 2, "0")
>> "01"
*/

import java.util.*;

public class E_524_Left_Pad {

    public static void main(String[] args) {

        String input = "foo";
        String output = leftPad(input, 5);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param originalStr: the string we want to append to with spaces
     * @param size: the target length of the string
     * @return: A string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
        return leftPad(originalStr, size, ' ');
    }

    /*
     * @param originalStr: the string we want to append to
     * @param size: the target length of the string
     * @param padChar: the character to pad to the left side of the string
     * @return: A string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        // write your code here
        int len = originalStr.length();
        if (len >= size) return originalStr;
        return new String(new char[size - len]).replace("\0", String.valueOf(padChar)) + originalStr;
    }

}
