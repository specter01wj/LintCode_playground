# Closest Number in Sorted Array

> Given a target number and an integer array A sorted in ascending order, find the index `i` in A such that A[i] is closest to the given target.
>
> Return -1 if there is no element in the array.
>
> __Notice__
>
> There can be duplicate elements in the array, and we can return any of the indices with same value.

## Example

Given `[1, 2, 3]` and target = `2`, return `1`.

Given `[1, 4, 6]` and target = `3`, return `1`.

Given `[1, 4, 6]` and target = `5`, return `1` or `2`.

Given `[1, 3, 3, 4]` and target = `2`, return `0` or `1` or `2`.

## Challenge

`O(logn)` time complexity.

## Solution

[C++](solution1.cpp)

## Source

[LintCode 459](http://www.lintcode.com/en/problem/closest-number-in-sorted-array/)