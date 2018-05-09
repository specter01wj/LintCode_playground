/*
Given a List <Point> p, find the number of (i,j) pairs that satisfy both p[i].x + p[j].x and p[i].y + p[j].y(i < j) can be divisible by 2.

 Notice
The length of given list len <= 10000.

Example
Given p = [[1,2],[3,4],[5,6]], return 3.

Explanation:
p[0],p[1],p[2] Pairwise Covering, the sum of their x and y can be divided by 2
Given p = [[0,3],[1,1],[3,4],[5,6]], return 1.

Explanation:
Only when p [2] and p [3] are combined, their sum of x and y can be divided by two.
*/

import java.util.*;

class Point {
    int x;
    int y;
}

public class E_844_Number_Pair_Statistics {

    public static void main(String[] args) {

        Point[] input = new Point[3];
        for(int i = 0; i < input.length; i++) {
        	input[i] = new Point();
        }
        input[0].x = 1;
        input[0].y = 2;
        input[1].x = 3;
        input[1].y = 4;
        input[2].x = 5;
        input[2].y = 6;
        int output = pairNumbers(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /**
     * @param p: the point List
     * @return: the numbers of pairs which meet the requirements
     */
    public static int pairNumbers(Point[] p) {
        // Write your code here
        int odd_odd = 0, odd_even = 0, even_odd = 0, even_even = 0;
        for(int i = 0; i < p.length; i++) {
            if(p[i].x % 2 == 1) {
                if(p[i].y % 2 == 1) {
                    odd_odd++;
                }
                else {
                    odd_even++;
                }
            }
            else {
                if(p[i].y % 2 == 1) {
                    even_odd++;
                }
                else {
                    even_even++;
                }
            }
        }
        int ans = 0;
        ans += odd_odd * (odd_odd - 1) / 2;
        ans += odd_even * (odd_even - 1) / 2;
        ans += even_odd * (even_odd - 1) / 2;
        ans += even_even * (even_even - 1) / 2;
        return ans;
    }

}
