/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):


Example
n = 10, I pick 4 (but you don't know)

Return 4. Correct !
*/

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

import java.util.*;

public class E_662_Guess_Number_Game {

    public static void main(String[] args) {

        int input = 10;
        int output = guessNumber(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /**
     * @param n an integer
     * @return the number you guess
     */
    public static int guessNumber(int n) {
        // Write your code here
        int lower = 1;
        int higher = n;
        while (lower <= higher) {
            int mid = lower + ((higher - lower) >> 1);
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                higher = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return -1;
    }

}
