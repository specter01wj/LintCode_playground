# Binary Search Tree Iterator

> Given a binary tree, return the _zigzag level order_ traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

## Example

Given binary tree `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

return its zigzag level order traversal as:

```
[
  [3],
  [20,9],
  [15,7]
]
```

## Solution

- Use `Deque`. [Java](solution1.java)

## Source

[LeetCode 103](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)