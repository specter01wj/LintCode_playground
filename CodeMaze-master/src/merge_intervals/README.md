# Merge Intervals

> Given a collection of intervals, merge all overlapping intervals.

## Example

Given `[1,3]`,`[2,6]`,`[8,10]`,`[15,18]`,
return `[1,6]`,`[8,10]`,`[15,18]`.

## Solution

- Sort both `start` and `end`: [Java](solution1.java)
- Sort `intervals` by `start` only: [Java](solution2.java)

## Notes

Review Java 8 lambda comparator

## Source

[LeetCode 56](https://leetcode.com/problems/merge-intervals/)