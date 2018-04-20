/*
Given a matrix, find a element that appear in all the rows in the matrix.You can assume that there is only one such element.

Example
For example:
Given a matrix:

[
  [2,5,3],
  [3,2,1],
  [1,3,5]
]
return 3
*/

import java.util.*;

public class E_737_Find_Elements_in_Matrix {

    public static void main(String[] args) {

        int[][] input = { {2,5,3}, {3,2,1}, {1,3,5} };
        int output = FindElements(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /**
     * @param Matrix: the input
     * @return: the element which appears every row
     */
    public static int FindElements(int[][] Matrix) {
        // write your code here
        if (Matrix.length == 0 || Matrix[0].length == 0) {
            return -1;
        }
        
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        
        //先把第一层的放好
        for (int i = 0; i < Matrix[0].length ;i++) {
            int key = Matrix[0][i];
            map.put(key, 1);
        }
        
        for(int j = 1; j < Matrix.length; j++){//从第二行开始
            for (int i = 0; i < Matrix[0].length ;i++) {//检查每一行
                int key = Matrix[j][i];
                if (map.containsKey(key) && map.get(key) < j + 1){//防止一行中有重复的
                    map.put(key, map.get(key) + 1);// update 
                }
            }
        }
        
        for (Integer key : map.keySet()) {
            if (map.get(key) == Matrix.length) {
                return key;
            }
        }
        
        return -1;
    }

}
