/*
Given two array a and b, a[i] and b[i] are friends. And then given two query arrays c and d, find whether c[i] and d[i] are friends within three jumps.(i.e A and B are friends, B and C are friends, so B is a one-jump friend of A and C is a two-jumps friend of A)

 Notice
The length of all arrays do not exceed 1000.
If there is more than one friend relationship chain, calculate the relationship of least jumps.

Example
Given a = [1,2], b = [2,3], c = [1], d = [3], return [1].

Explanation:
1 → 2 → 3 ，3 is a two-jumps friend of 1.
Given a = [1,2,3,4], b = [2,3,4,5], c = [1,1], d = [4,5], return [1,0].

Explanation:
1 → 2 → 3 → 4 → 5，4 is a three-jumps friend of 1, 5 is a four-jumps friend of 1.
*/

import java.util.*;

public class E_932_Friends_Within_Three_Jumps {

    public static void main(String[] args) {

        int[] a = {1,2}, b = {2,3}, c = {1}, d = {3};
        int[] output = withinThreeJumps(a, b, c, d);
        System.out.println("input1: " + Arrays.toString(a) + " input2: " + Arrays.toString(b) + 
                            " input3: " + Arrays.toString(c) + " input4: " + Arrays.toString(d) + 
                            "\noutput: " + Arrays.toString(output));

    }

    /**
     * @param a: The a tuple
     * @param b: The b tuple
     * @param c: the c tuple
     * @param d: the d tuple
     * @return: The answer
     */
    
    public static int[] withinThreeJumps(int[] a, int[] b, int[] c, int[] d) {
        // Write your code here
        int n = a.length;
        int m = c.length;
        int[] res = new int[m];
        ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 1001; i++) {
            ArrayList<Integer> ins = new ArrayList<Integer>();
            g.add(ins);
        }
        for (int i = 0; i < n; i++) {
            g.get(a[i]).add(b[i]);
            g.get(b[i]).add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            res[i] = dfs(c[i], d[i], 0, 3, g);
        }
        return res;
    }

    static int dfs(int cur, int ed, int dep, int maxDep, ArrayList<ArrayList<Integer>> g) {
        if (cur == ed) {
            return 1;
        }
        if (dep == maxDep) {
            return 0;
        }
        for (int nxt : g.get(cur)) {
            if (dfs(nxt, ed, dep + 1, maxDep, g) == 1) {
                return 1;
            }
        }
        return 0;
    }

}
