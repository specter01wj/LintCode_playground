/*
Give k, a, b, which means a and b are all k base numbers, and output a + b.

 Notice
2 <= k <= 10
a, b are strings, the length does not exceed 1000.
There may be a leading zero.

Example
Given k = 3, a = "12", b = "1", return "20".

Explanation:
12 + 1 = 20 in 3 bases.
Given k = 10, a = "12", b = "1", return "13".

Explanation:
12 + 1 = 13 in 10 bases.
*/

import java.util.*;

public class E_1398_K_Decimal_Addition {

    public static void main(String[] args) {

        int input = 3;
        String a = "12", b = "1";
        String output = addition(input, a, b);
        System.out.println("input: " + (input) + " a: " + (a) + " b: " + (b) + "\noutput: " + (output));

    }

    /**
     * @param k: The k
     * @param a: The A
     * @param b: The B
     * @return: The answer
     */
    public static String addition(int k, String a, String b) {
        // Write your code here
        int i, j, temp = 0;
        for(i = 0; i < a.length(); i++) {
            if(a.charAt(i) != '0'){
                break;
            }
        }
        a = a.substring(i);
        for(i = 0; i < b.length(); i++) {
            if(b.charAt(i) != '0') {
                break;
            }
        }
        b = b.substring(i);
        if(a.length() < b.length()){
            String t = a;
            a = b;
            b = t;
        }
        StringBuffer c = new StringBuffer(a);
        j = b.length() - 1;
        for(i = a.length() - 1; i >= 0; i--) {
            int sum = a.charAt(i) - '0';
            if(j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            if(temp != 0) {
                sum += temp;
            }
            c.setCharAt(i, (char)(sum % k + '0'));
            temp = sum / k;
        }
        StringBuffer ans = new StringBuffer();
        if(temp != 0) {
            ans.insert(0, (char)('0' + temp));
        }
        ans.append(c);
        return ans.toString();
    }

}
