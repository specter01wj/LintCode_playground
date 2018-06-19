/*
Gives nn coins, each weighing 10g, but the weight of one coin is 11g. There is now a balance that can be accurately weighed. Ask at least a few times to be sure to find the 11g gold coin.

Example
Given n = 3, return 1.

Explanation:
Select two gold coins on the two ends of the balance. If the two ends of the balance are level, the third gold coin is 11g, otherwise the heavy one is 11g.
Given n = 4, return 2.

Explanation:
Four gold coins can be divided into two groups and placed on both ends of the scale. According to the weighing results, select the two heavy gold coins and place them on the two ends of the balance for the second weighing. The gold coin at the heavy end is 11g gold coins.
*/

import java.util.*;

public class E_1417_Weighing_Problem {

    public static void main(String[] args) {

        int input = 4;
        int output = minimumtimes(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param n: The number of coins
     * @return: The Minimum weighing times int worst case
     */
    public static int minimumtimes(int n) {
        // Write your code here
        int ans;
        ans = 0;
        if (n % 3 == 0 ) {
            n = n - 1;
        }
        while (n > 0) {
            n = n / 3;
            ans++;
        }
        return ans;
    }

}
