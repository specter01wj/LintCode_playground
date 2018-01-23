# Add Two Numbers II

> You are given two __non-empty__ linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
>
> You may assume the two numbers do not contain any leading zero, except the number 0 itself.
>
>
> __Follow up__
>
> What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

## Example

```
Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
```

## Solution

- Reverse `ListNode` in Stack, then reverse to add
	- [Java](solution1.java)
- No reverse
	- [Java](solution2.java)
	- [Java Optimazed](solution2_1.java)

## Notes

- Could not just use number to add, check [this](solution2_0.java)

## Source

[LeetCode 445](https://leetcode.com/problems/add-two-numbers-ii/)