# Find Peak Element

> A peak element is an element that is greater than its neighbors.
>
> Given an input array where `num[i] ≠ num[i+1]`, find a peak element and return its index.
>
> The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
>
> You may imagine that `num[-1] = num[n] = -∞`.
>
> For example, in array `[1, 2, 3, 1]`, `3` is a peak element and your function should return the index number `2`.

## Challenge

Your solution should be in logarithmic complexity.

## Solution

#### Linear time complexity

[Java](solution1.java)

#### Logarithmic time complexity, use _Binary Search_

[Java](solution2.java)

## Source

[LeetCode 162](https://leetcode.com/problems/find-peak-element/)