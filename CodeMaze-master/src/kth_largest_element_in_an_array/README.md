# Kth Largest Element in an Array

> Find the __k__ th largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

## Example

Given `[3,2,1,5,6,4]` and k = 2, return 5.

## Notice

You may assume k is always valid, 1 ≤ k ≤ array's length.

## Solution

- Heap Sort. [Java](solution1.java)
- PQ. [Java](solution2.java)
- Quick Select. Shuffle will greatly improve speed for worst case. [Java](solution3.java)

## Source

[LeetCode 215](https://leetcode.com/problems/kth-largest-element-in-an-array/)