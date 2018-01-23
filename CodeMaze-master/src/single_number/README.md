# Single Number

> Given an array of integers, every element appears twice except for one. Find that single one.
>
> __Note:__
>
> Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

## Solution 1

1. Use [std::sort](http://www.cplusplus.com/reference/algorithm/sort/) to sort the array.
	* std::sort complexity: _O(N·log(N))_
2. 'for loop' to go through the sorted array with a '2 steps' for each loop.
3. Compare `A[i]` with `A[i+1]`. Equal to continue, or `A[i]` will be the single number to return.
4. Otherwise the last element in the array will be the single number.

## Solution 2

Bitwise `XOR` solution

`^` operator: The bit is 1 if either but not both operands contain 1; otherwise, the result is 0.

## Sources

#### Linear runtime complexity

An algorithm is said to take __linear time__, or __O(n)__ time, if its time complexity is O(n).

References: [Time Complexity](http://en.wikipedia.org/wiki/Time_complexity).