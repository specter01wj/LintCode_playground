/*
Given two arrays a and b. a[i] stands for the royalties of the film i, b[i] represents the money that the movie i can sell, now we have principal k, find how much money can be earned in the end.(Each movie only needs to be bought once and can only be sold once.)

 Notice
All the input does not exceed 100000
The size of array does not exceed 10000.
Have you met this question in a real interview? 
Example
Given a = [3,1,5], b = [4,3,100], k = 1，return 4.

Explanation:
Buy the second video first, then sell it, buy the first video, sell it again, and finally the principal becomes 4.
Given a = [3,1,5], b = [4,3,100], k = 10，return 108。

Explanation:
Buy all the videos, sell them, and finally the principal becomes 108.
*/

import java.util.*;

class pair implements Comparable<pair>{
    public int a, b;
    public pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int compareTo(pair obj) {  
        return a - obj .a;
    }  
}

public class E_970_Big_Business {

    public static void main(String[] args) {

        int[] a = {3,1,5}, b = {4,3,100};
        int k = 1;
        int output = bigBusiness(a, b, k);
        System.out.println("input1: " + Arrays.toString(a) +
                            " input2: " + Arrays.toString(b) + "\noutput: " + (output));

    }

    /**
     * @param a: The cost of the film
     * @param b: The price of the selling of the film
     * @param k: The principal
     * @return: The answer
     */
    public static int bigBusiness(int[] a, int[] b, int k) {
        // Write your code here
        List<pair> list = new ArrayList<pair>();
        for(int i = 0; i < a.length; i++) {
            list.add(new pair(a[i], b[i]));
        }
        Collections.sort(list);
        for(pair t : list) {
            if(t.b - t.a > 0 && k >= t.a) {
                k += t.b - t.a;
            }
        }
        return k;
    }

}
