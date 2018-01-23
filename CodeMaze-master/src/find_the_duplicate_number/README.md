# Find the Duplicate Number

> Given an array _nums_ containing `n + 1` integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

## Notice

- You __must not__ modify the array (assume the array is read only).
- You must use only constant, O(1) extra space.
- Your runtime complexity should be less than O(n2).
- There is only one duplicate number in the array, but it could be repeated more than once.

## Solution

- Brute force, _O(n^2)_. [Java](solution1.java)
- Two pointers, just like find loop's entry point in a linked list. [Java](solution2.java)
- Binary search. Could not understand!!! [Java](solution3.java)
- Sorting (break rule but work)
- Set (break rule but work)

## Source

[LeetCode 287](https://leetcode.com/problems/find-the-duplicate-number/)