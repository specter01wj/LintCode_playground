/*
Find the Nth number in Fibonacci sequence.

A Fibonacci sequence is defined as follow:

The first two numbers are 0 and 1.
The i th number is the sum of i-1 th number and i-2 th number.
The first ten numbers in Fibonacci sequence is:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
*/

/*
Thoughts:
Bottomup with for loop.
1. If non-recursion, do for loop for that n
2. Note: this specfiic problem is not 0-based. it's 1-based.
3. return fib[n]
*/
public class N_366_Fibonacci {

    public static void main(String[] args) {

        int input = 10;
        int output = fibonacci(input);
        System.out.println("input: " + input + "\noutput: " + output);

    }

    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        }
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n - 1];
    }
}


/*
    Recursive. Long time complexity
    Timeout
*/
/*class Solution {
    public int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } 
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}*/
