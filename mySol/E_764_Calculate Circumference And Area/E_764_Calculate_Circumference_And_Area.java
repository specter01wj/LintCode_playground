/*
Given radius r, returns the circle's circumference nums[0] and area nums[1].The result retains two decimal places.

 Notice
PI = 3.14

Example
Given r = 2
return [12.56, 12.56]
*/

import java.util.*;

public class E_764_Calculate_Circumference_And_Area {

    public static void main(String[] args) {

        int input = 4;
        double[] output = calculate(input);
        System.out.println("input: " + input + "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public static double[] calculate(int r) {
        // write your code here
        double[] a = new double[2];
        a[0] = 2 * 3.14 * r;
        a[1] = 3.14 * r * r;
        return a;
    }

}
