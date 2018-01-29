/*
Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

Example
Consider the following matrix:

[
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 50]
]
Given target = 3, return true.
 */
import java.util.*;

public class E_28_Search_a_2D_Matrix {

    public static void main(String[] args) {

        int[][] input = {{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 50}};
        boolean output = searchMatrix(input, 16);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int rowIndex = binarySearchRow(matrix, target);
        if( rowIndex == -1 ) {
            return false;
        }

        return binarySearchElement(matrix[rowIndex], target);
    }

    private static int binarySearchRow(int[][] matrix, int target) {
        int start = 0, end = matrix.length - 1;

        while( start <= end ) {
            int mid = (start + end) / 2;
            int[] row = matrix[mid];
            if(target < row[0]) {
                end = mid - 1;
            } else if( target > row[row.length - 1] ){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;   
    }

    private static boolean binarySearchElement(int[] row, int target) {
        int start = 0, end = row.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < row[mid]) {
                end = mid - 1;
            } else if (target > row[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    /*private static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }*/

}
