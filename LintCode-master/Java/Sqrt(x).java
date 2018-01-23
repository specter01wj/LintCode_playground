E

理解题意, 从[0, x]找一个可以m*m=x的值.
注意, 如果找不到, 最后问考官该return一个什么值：按道理，因为return int, 会取整，那么return一个平方最close to x就可以.
注意 mid 用 long, 因为很可能超过最大int.

```
/*
Implement int sqrt(int x).

Compute and return the square root of x.

Example
sqrt(3) = 1

sqrt(4) = 2

sqrt(5) = 2

sqrt(10) = 3
Challenge
O(log(x))

Tags Expand 
Binary Search

Thinking process:
Binary search. While loop until the head and tail meets.
*/

/*
Thoughts:
We need to assume x is positive. There must be m such that m*m = x. Find m using binary search.
Note, naturally m will be in [0, x]
*/
class Solution {
    public int mySqrt(int x) {
        /*
        // 之后的逻辑都包含
        if (x <= 0) {
            return 0;
        }*/
        long start = 0;
        long end = x;
        while(start <= end) {
            long mid = (start + end) / 2; // Or: long mid = start + (end - start) / 2;
            
            if (mid * mid < x) {
                start = mid + 1;
            } else if (mid * mid > x){
                end = mid - 1;
            } else {
                return (int)mid;
            }
        }
        //When start > end, while loop ends. That means, end must be the largest possible integer that end^2 is closest to x.
        return (int)end;
    }
}

```