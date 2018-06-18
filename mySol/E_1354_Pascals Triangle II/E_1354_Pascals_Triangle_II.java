/*
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Example
Example:

Input: 3
Output: [1,3,3,1]
*/

import java.util.*;

public class E_1354_Pascals_Triangle_II {

    public static void main(String[] args) {

        int input = 3;
        List<Integer> output = getRow(input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param rowIndex: a non-negative index
     * @return: the kth index row of the Pascal's triangle
     */
    public static List<Integer> getRow(int rowIndex) {
        // write your code here
        ArrayList<Integer> rst = new ArrayList<Integer>();
        rowIndex += 1;
        if (rowIndex == 0) {
            return rst;
        }

        rst.add(1);
        for (int i = 1; i < rowIndex; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(i+1);
            for (int j = 0; j < i + 1; j++) {
                tmp.add(-1);
            }
            tmp.set(0, rst.get(0));
            tmp.set(i, rst.get(i - 1));
            for (int j = 1; j < i; j++) {
                tmp.set(j, rst.get(j - 1) + rst.get(j));
            }
            rst = tmp;
        }
        return rst;
    }

}
