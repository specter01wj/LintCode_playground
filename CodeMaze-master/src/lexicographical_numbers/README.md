# Lexicographical Numbers

> Given an integer _n_, return 1 - _n_ in lexicographical order.
>
> For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
>
> Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.

## Solution

- Quick Sort. Time Limit Exceeded. [Java](solution1.java)
    - will cause error when `999` without shuffle
    - will cause error when `10458` with shuffle
- DFS. [Java](solution2.java)

## Source

[LeetCode 2](https://leetcode.com/problems/add-two-numbers/)