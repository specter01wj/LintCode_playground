/*
Determine whether a Sudoku is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character ..

 Notice
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

Clarification
What is Sudoku?

http://sudoku.com.au/TheRules.aspx
https://zh.wikipedia.org/wiki/%E6%95%B8%E7%8D%A8
https://en.wikipedia.org/wiki/Sudoku
http://baike.baidu.com/subview/961/10842669.htm

*/

import java.util.*;

public class E_389_Valid_Sudoku {

    public static void main(String[] args) {

        char[][] input = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
        boolean output = isValidSudoku(input);
        System.out.println("input: " + Arrays.deepToString(input) + "\noutput: " + output);

    }

    /*
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public static boolean isValidSudoku(char[][] board) {
        // write your code here
        List<Set<Integer>> rows = new ArrayList<>();
        List<Set<Integer>> cols = new ArrayList<>();
        List<Set<Integer>> blocks = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<Integer>());
            cols.add(new HashSet<Integer>());
            blocks.add(new HashSet<Integer>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int k = board[i][j] - '0';

                    if (rows.get(i).contains(k)) {
                        return false;
                    }
                    rows.get(i).add(k);

                    if (cols.get(j).contains(k)) {
                        return false;
                    }
                    cols.get(j).add(k);

                    if (blocks.get(i / 3 * 3 + j / 3).contains(k)) {
                        return false;
                    }
                    blocks.get(i / 3 * 3 + j / 3).add(k);
                }
            }
        }
        return true;
    }

}
