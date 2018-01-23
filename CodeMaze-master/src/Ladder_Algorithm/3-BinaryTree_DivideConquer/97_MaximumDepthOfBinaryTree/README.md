# Maximum Depth of Binary Tree

> Given a binary tree, find its maximum depth.
>
> The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Solution 1

Recursive:

* Use [std::max](http://www.cplusplus.com/reference/algorithm/max/) to compare left child depth with right child depth.
* NULL binary tree is the base case.

## Solution 2

Iterative:

* Use stack or vector to store TreeNode level by level.

## Sources

#### Binary Tree

A __binary tree__ is a tree data structure in which each node has at most two children, which are referred to as the _left_ child and the _right_ child.

###### Types

* A __rooted__ binary tree has a root node and every node has at most two children.
* In a __full__ binary tree or __proper__ binary tree every node other than the leaves has two children.
* A __perfect__ binary tree is a _full binary tree_ in which all _leaves_ have the same _depth_ or same _level_.
* In a __complete__ binary tree every level, except poosibly the last, is completely filld, and all nodes in the last level are as far left as possible.
* A __balanced__ binary tree has the minimum possible maximum height(a.k.a. depth) for the leaf nodes, because for any given number of leaf nodes the leaf nodes are placed at the greatest height possible.

References: [Binary Tree](http://en.wikipedia.org/wiki/Binary_tree)

#### Recursion

Recursion is useful for tasks that can be defined in terms of similar subtasks. For example, __sort__, __search__ and __traversal__ problems often have simple recursive solutions.

Recursive algorithms have two cases: __recursive cases__ and __base cases__. Every recursive case must _eventually lead_ to a base case.

It may be useful to write a _separate wrapper function_ to do initialization for a complex recursive function.

Iterative solutions are usually _more efficient_ than recursive solutions.