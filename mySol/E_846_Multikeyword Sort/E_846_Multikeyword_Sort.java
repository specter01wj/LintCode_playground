/*
Given n students(number from 1 to n) and their examination grades. There are two keywords, examination grades and student id. Order the array according to the first keyword (Descending), if the first key is the same, it is sorted by the second keyword (ascending).

Example
Given [[2,50],[1,50],[3,100]],
return [[3,100],[1,50],[2,50]]
*/

import java.util.*;

public class E_846_Multikeyword_Sort {

    public static void main(String[] args) {

        int[][] input = {{2,50},{1,50},{3,100}};
        System.out.println("input: " + Arrays.deepToString(input));
        int[][] output = multiSort(input);
        System.out.println("output: " + Arrays.deepToString(output));

    }

    /**
     * @param array: the input array
     * @return: the sorted array
     */
    public static int[][] multiSort(int[][] array) {
        // Write your code here
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (!cmp(array[i], array[j])) {
                    int tmp = array[i][0];
                    array[i][0] = array[j][0];
                    array[j][0] = tmp;
                    
                    tmp = array[i][1];
                    array[i][1] = array[j][1];
                    array[j][1] = tmp;
                }
            }
        }
        
        return array;
    }
    
    static boolean cmp(int[] a, int[] b) {
        if (a[1] > b[1]) {
            return true;
        }
        if (a[1] == b[1] && a[0] < b[0]) {
            return true;
        } 
        return false;
    }

}
