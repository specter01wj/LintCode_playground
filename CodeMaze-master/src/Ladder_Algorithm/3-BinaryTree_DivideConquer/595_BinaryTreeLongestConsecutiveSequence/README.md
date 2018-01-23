# Binary Tree Longest Consecutive Sequence

> Given a binary tree, find the length of the longest consecutive sequence path.

> The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The longest consecutive path need to be from parent to child (`cannot be the reverse`).

## Example

For example:

```
   1
    \
     3
    / \
   2   4
        \
         5
```

Longest consecutive sequence path is `3-4-5`, so return `3`.

```
   2
    \
     3
    / 
   2    
  / 
 1
```

Longest consecutive sequence path is `2-3`,not`3-2-1`, so return `2`.

## Solution

- when current node is `NULL` or current node equals either one of `A`, `B`, return currnt node which is lowest-common-ancestor
- divide `left` and `right` to find the lowest-common-ancestor in each way
- conquer each way
	- if both find lowest-common-ancestor, the current node is lowest-common-ancestor
	- if only one way find lowest-common-ancestor, will keep looking in that way

## Source

[LintCode](http://www.lintcode.com/en/problem/binary-tree-longest-consecutive-sequence/)