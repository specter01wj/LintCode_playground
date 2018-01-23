# Populating Next Right Pointers in Each Node II

> Follow up for problem "Populating Next Right Pointers in Each Node".
>
> What if the given tree could be any binary tree? Would your previous solution still work?

## Notice

- You may only use constant extra space.

## Example

Given the following binary tree,

```
         1
       /  \
      2    3
     / \    \
    4   5    7
```

After calling your function, the tree should look like:

```
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
```

## Solution

[Java](solution1.java)

## Notes

- Use two nodes: `finder` and `linker` to go through each level.

## Source

[LeetCode 117](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)