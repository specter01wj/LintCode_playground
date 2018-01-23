# Kth Smallest Element in a BST

> Given a binary search tree, write a function `kthSmallest` to find the kth smallest element in it.

## Follow Up

What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

## Notice

You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

## Solution

- Inorder traverse BST. 
    - Iterative: [Java](solution1.java)
    - Recursive: [Java](solution2.java)
- Binary Search: [Java](solution3.java)


## Source

[LeetCode 230](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)