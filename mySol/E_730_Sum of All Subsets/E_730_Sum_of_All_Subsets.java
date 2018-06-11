/*
Given a number n, we need to find the sum of all the elements from all possible subsets of a set formed by first n natural numbers.

Example
Given n = 2, return 6
Possible subsets are {{1}, {2}, {1, 2}}. Sum of elements in subsets
is 1 + 2 + 1 + 2 = 6

Given n = 3, return 24
Possible subsets are {{1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}
Sum of subsets is : 
1 + 2 + 3 + (1 + 2) + (1 + 3) + 
(2 + 3) + (1 + 2 + 3)
*/

import java.util.*;

public class E_730_Sum_of_All_Subsets {

    public static void main(String[] args) {

        int input = 2;
        int output = subSum(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: the given number
     * @return: Sum of elements in subsets
     */
    public static int subSum(int n) {
        // write your code here
        int sum=0;
        for(int i=0;i<=n;i++)
            sum+=i;
        return sum*(int)Math.pow(2,n-1);
    }

}
