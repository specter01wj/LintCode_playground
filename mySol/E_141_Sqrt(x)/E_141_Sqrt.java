/*
Implement int sqrt(int x).

Compute and return the square root of x.

Example
sqrt(3) = 1

sqrt(4) = 2

sqrt(5) = 2

sqrt(10) = 3
*/

import java.util.*;

public class E_141_Sqrt {

    public static void main(String[] args) {

        int input = 10;
        int output = sqrt(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param x: An integer
     * @return: The sqrt of x
     */
    public static int sqrt(int x) {
        // write your code here
        if (x == 0 || x == 1) {
          return x;
        }
        int lower = 0;
        int upper = x;
        while (lower <= upper) {
          int mid = (lower + upper) >> 1;
          if (x / mid < mid) {
            upper = mid - 1;
          } else {
            if (x / (mid + 1) <= mid) {
              return mid;
            }
            lower = mid + 1;
          }
        }
        return lower;
    }

}
