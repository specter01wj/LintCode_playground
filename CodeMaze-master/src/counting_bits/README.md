# Counting Bits

> Given a non negative integer number __num__. For every numbers __i__ in the range __0 ≤ i ≤ num__ calculate the number of 1's in their binary representation and return them as an array.

## Example

For `num = 5` you should return `[0,1,1,2,1,2]`.

## Follow up:

- It is very easy to come up with a solution with run time `O(n*sizeof(integer))`. But can you do it in linear time `O(n)` /possibly in a single pass?
- Space complexity should be `O(n)`.
- Can you do it like a boss? Do it without using any builtin function like `__builtin_popcount` in c++ or in any other language.

## Solution

- Mod 2: [C++](solution1.cpp), [Objective-C](solution1.m)

- Bits manipulation: [C++](solution2.cpp), [Swift](solution2.swift)

- Dynamic programming: [C++](solution3.cpp), [Swift](solution2.swift)

- `x &(x - 1)` clears the lowest set bit in `x`

## Hint
- You should make use of what you have produced already.
- Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
- Or does the odd/even status of the number help you in calculating the number of 1s?

## Source

[LeetCode 338](https://leetcode.com/problems/counting-bits/)

EPI P27