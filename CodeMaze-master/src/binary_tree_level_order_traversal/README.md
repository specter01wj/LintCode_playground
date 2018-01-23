# Binary Tree Level Order Traversal

> Given a binary tree, return the _level order_ traversal of its nodes' values. (ie, from left to right, level by level).

## Example

Given binary tree `{3,9,20,#,#,15,7}`,

```
    3
   / \
  9  20
    /  \
   15   7
```

return its level order traversal as:

```
[
  [3],
  [9,20],
  [15,7]
]
```

## Solution

- Just use a `Queue` to traverse each level of the tree. [Java](solution1.java) | [C++](solution1.cpp)

## Source

[LeetCode 102](https://leetcode.com/problems/binary-tree-level-order-traversal/)

[LintCode 69](http://www.lintcode.com/en/problem/binary-tree-level-order-traversal/)