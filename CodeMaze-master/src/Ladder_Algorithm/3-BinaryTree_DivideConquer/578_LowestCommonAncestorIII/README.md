# Lowest Common Ancestor

> Given the root and two nodes in a Binary Tree. Find the lowest common ancestor(LCA) of the two nodes.

> The lowest common ancestor is the node with largest depth which is the ancestor of both nodes.

> Return `null` if LCA does not exist.

> __Notice__

> node A or node B may not exist in tree.

> __Example__

> Given the below binary tree:

```
  4
 / \
3   7
   / \
  5   6
```

> LCA(3, 5) = `4`

> LCA(5, 6) = `7`

> LCA(6, 7) = `7`

## Solution

- when current node is `NULL` or current node equals either one of `A`, `B`, return currnt node which is lowest-common-ancestor
- divide `left` and `right` to find the lowest-common-ancestor in each way
- conquer each way
	- if both find lowest-common-ancestor, the current node is lowest-common-ancestor
	- if only one way find lowest-common-ancestor, will keep looking in that way

## Source

[LintCode](http://www.lintcode.com/en/problem/lowest-common-ancestor-iii/)