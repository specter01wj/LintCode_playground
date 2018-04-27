/*
Determine whether year n is a leap year.return true if n is a leap year.

 Notice
A leap year (also known as an intercalary year or bissextile year) is a calendar year containing one additional day.if a year is divisible by 4 and not divisible by 100 or divisible by 400,it is a leap year. --wikipedia

Example
Given n = 2008
return true
Given n = 2018
return false
*/

import java.util.*;

public class E_766_Leap_Year {

    public static void main(String[] args) {

        int input = 2008;
        boolean output = isLeapYear(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public static boolean isLeapYear(int n) {
        // write your code here
        return (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0));
    }

}
