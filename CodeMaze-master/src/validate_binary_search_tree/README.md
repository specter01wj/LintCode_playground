# Validate Binary Search Tree

> Given a binary tree, determine if it is a valid binary search tree (BST).
>
> Assume a BST is defined as follows:
>
> - The left subtree of a node contains only nodes with keys __less than__ the node's key.
>
> - The right subtree of a node contains only nodes with keys __greater than__ the node's key.
>
> - Both the left and right subtrees must also be binary search trees.
>
> - A single node tree is a BST

## Example

```
    2
   / \
  1   3
```

Binary tree `[2, 1, 3]`, return true.

```
    1
   / \
  2   3
```

Binary tree `[1, 2, 3]`, return false.

## Solution

- Recursive, [Java](solution1.java) | [C++](solution1.cpp)
- Iterative, use stack to inorder traverse, [Java](solution2.java)

## Notes

- Should compare with all subtree nodes, not only left and right nodes.

## Source

[LeetCode 98](https://leetcode.com/problems/validate-binary-search-tree/)

[LintCode 95](http://www.lintcode.com/en/problem/validate-binary-search-tree/)