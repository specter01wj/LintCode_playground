# Implement Queue using Stacks

> Implement the following operations of a queue using stacks.
> - push(x) -- Push element x to the back of queue.
> - pop() -- Removes the element from in front of queue.
> - peek() -- Get the front element.
> - empty() -- Return whether the queue is empty.

## Notice

- You must use only standard operations of a stack -- which means only `push to top`, `peek/pop from top`, `size`, and `is empty` operations are valid.
- Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
- You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

## Solution

- Only use the second stack on `push()`, [Java](solution1.java)
- Amortized, [Java](solution2.java)


## Source

[LeetCode 232](https://leetcode.com/problems/implement-queue-using-stacks/)