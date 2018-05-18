/*
8 is the lucky number of Xiaojiu. Xiaojiu wants to know how many numbers in the numbers 1~n contain 8.

 Notice
1 <= n <= 1000000

Example
Given n = 20, return 2.

Explanation:
Only 8,18 contains 8.
Given n = 100, return 19.

Explanation:
8,18,28,38,48,58,68,78,80,81,82,83,84,85,86,87,88,89,98 contains 8.
*/

import java.util.*;

public class E_1385_Lucky_Number_Eight {

    public static void main(String[] args) {

        int input = 20;
        int output = luckyNumber(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param n: count lucky numbers from 1 ~ n
     * @return: the numbers of lucky number
     */
    public static int luckyNumber(int n) {
        // Write your code here
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            int x = i;
            while(x != 0) {
                if(x % 10 == 8) {
                    ans++;
                    break;
                }
                x /= 10;
            }
        }
        return ans;
    }

}
