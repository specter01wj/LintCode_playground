/*
Given an integer n, return the first n-line Yang Hui triangle.

 Notice
1.0<=n<=20
2.Yang Hui’s Triangle also called Pascal's triangle. --(Wikipedia)

Example
Given n = 4
return 
[
 [1]
 [1,1]
 [1,2,1]
 [1,3,3,1]
]
*/

import java.util.*;

public class E_768_Yang_Hui_Triangle {

    public static void main(String[] args) {

        int input = 4;
        List<List<Integer>> output = calcYangHuisTriangle(input);
        System.out.println("input: " + input + "\noutput: " + (output));

    }

    /**
     * @param n: a Integer
     * @return: the first n-line Yang Hui's triangle
     */
    public static List<List<Integer>> calcYangHuisTriangle(int n) {
        // write your code here
        List<List<Integer> > res = new ArrayList<>();
        int i, j;
        if (n == 0) {
            return res;
        }
        
        for (i = 0; i < n; ++i) {
            List<Integer> t = new ArrayList<Integer>();
            t.add(1);   
            for (j = 1; j < i; ++j) {
                t.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));    
            }
            
            if (i > 0) {
                t.add(1);
            }
            
            res.add(t);
        }
        
        return res;
    }

}
