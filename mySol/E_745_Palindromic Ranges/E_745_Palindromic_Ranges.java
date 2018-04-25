/*
A positive integer is a palindrome if its decimal representation (without leading zeros) is a palindromic string (a string that reads the same forwards and backwards). For example, the numbers 5, 77, 363, 4884, 11111, 12121 and 349943 are palindromes.

A range of integers is interesting if it contains an even number of palindromes. The range [L, R], with L <= R, is defined as the sequence of integers from L to R (inclusive): (L, L+1, L+2, …, R-1, R). L and R are the range’s first and last numbers.

The range [L1, R1] is a subrange of [L, R] if L <= L1 <= R1 <= R. Your job is to determine how many interesting subranges of [L, R] there are.

Example
Given L = 1, R = 2, return 1
Given L = 1, R = 7, return 12
Given L = 87, R = 88, return 1
*/

import java.util.*;

public class E_745_Palindromic_Ranges {

    public static void main(String[] args) {

        int L = 1; int R = 7;
        int output = PalindromicRanges(L, R);
        System.out.println("input: " + L + " ," + R + "\noutput: " + output);

    }

    /**
     * @param L: A positive integer
     * @param R: A positive integer
     * @return: the number of interesting subranges of [L, R]
     */
    public static int PalindromicRanges(int L, int R) {
        // Write your code here
        if(L > R) return 0;
        if(L == R) return 1;
        int[] dp = new int[R-L+2];
        dp[0] = 0;
        for(int i=L;i<=R;i++){
            dp[i-L+1] = dp[i-L];
            if(isPalindrom(i)) dp[i-L+1]++;
        }
        int total = 0;
        for(int i=1;i<=R-L+1;i++){
            for(int j=i-1;j>=0;j--){
                int count = dp[i] - dp[j];
                //按照题目中第三个例子，range里面不存在palindrom也算valid range, means count could equal to 0
                if(count%2 == 0) total++;
            }
        }
        return total;
    }
    
    private static boolean isPalindrom(int x){
        if(x/10 == 0) return true;
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
