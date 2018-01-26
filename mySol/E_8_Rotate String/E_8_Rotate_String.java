/*
Given a string and an offset, rotate string by offset. (rotate from left to right)

Example
Given "abcdefg".

offset=0 => "abcdefg"
offset=1 => "gabcdef"
offset=2 => "fgabcde"
offset=3 => "efgabcd"
*/

/*Thoughts:
还是三步rotate.
有个坑：offset可能很长，那么要%length，才能得到真正需要rotate的部分。
Note: rotate 一个 full length之后，是string 不变

Reverse the two parts(before and after the offset), 
then reverse the whole string, then the two parts are swapped, 
but within each part the characters are still in their original order.
*/
import java.util.*;

public class E_8_Rotate_String {

    public static void main(String[] args) {

        char[] input = {'a','b','c','d','e','f','g'};
        char[] output = rotateString(input, 1);
        System.out.println("input: " + Arrays.toString(input) + 
            "\noutput: " + Arrays.toString(output));

    }

    /*
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public static char[] rotateString(char[] str, int offset) {
        // write your code here
        if (str.length == 0) {
            return str;
        }
        offset = offset % str.length;
        reverse(str, 0, str.length - 1);
        reverse(str, 0, offset - 1);
        reverse(str, offset, str.length - 1);
        return str;
    }
    
    private static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }

}
