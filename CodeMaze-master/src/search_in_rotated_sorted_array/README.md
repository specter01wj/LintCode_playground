# Search in Rotated Sorted Array

> Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
> 
> (i.e., `0 1 2 4 5 6 7` might become `4 5 6 7 0 1 2`).
>
> You are given a target value to search. If found in the array return its index, otherwise return -1.
>
> You may assume no duplicate exists in the array.

## Solution

- Go through the whole array to search target. [C++](solution1.cpp)
- Binary search, need to determine which side get rotated first. This solution only works on ascending order. [C++](solution2.cpp) | [Java](solution2.java)

## Sources

[LeetCode 33](https://leetcode.com/problems/search-in-rotated-sorted-array/)

## Notes

#### Binary Search

A __binary search__ or __half-interval search__ algorithm finds the position of a specified input value (the search "key") within an array sorted by key value.