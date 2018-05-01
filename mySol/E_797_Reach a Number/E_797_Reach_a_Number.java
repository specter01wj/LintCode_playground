/*
You are standing at position 0 on an infinite number line. There is a goal at position target.

On each move, you can either go left or right. During the n-th move (starting from 1), you take n steps.

Return the minimum number of steps required to reach the destination.

 Notice
target will be a non-zero integer in the range [-10^9, 10^9].

Example
Example 1:

Given target = 3
Return 2
Explanation:
On the first move we step from 0 to 1.
On the second step we step from 1 to 3.
Example 2:

Given target = 2
Return 3
Explanation:
On the first move we step from 0 to 1.
On the second move we step  from 1 to -1.
On the third move we step from -1 to 2.
*/

import java.util.*;

public class E_797_Reach_a_Number {

    public static void main(String[] args) {

        int input = 2;
        int output = reachNumber(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param target: the destination
     * @return: the minimum number of steps
     */
    public static int reachNumber(int target) {
        // Write your code here
        target = Math.abs(target);
        
        int step = 1, pos = 0;
        while (pos < target) {
            pos += step;
            step++;
        }
        step--;
        
        if (pos == target) return step;
        
        pos -= target;
        if (pos % 2 == 0) {
            return step;
        } else if ((step + 1) % 2 == 1) {
            return step + 1;
        } else {
            return step + 2;
        }
    }

}
