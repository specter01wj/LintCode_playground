# Min Stack

> Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
>
> - push(x) -- Push element x onto stack.
> - pop() -- Removes the element on top of the stack.
> - top() -- Get the top element.
> - getMin() -- Retrieve the minimum element in the stack.

## Example

```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
```

## Solution

[Java](solution1.java)

## Notes

Can implement a stack with a stack with either resizing array or linked list.

- Linked-list ([Solution1](solution1.java))
	- Every operation takes constant time in the worst case.
	- Uses extra time and space to deal with the links.
- Resizing-array
	- Every operation takes constant amortized time.
	- Less wasted space.

## Source

[LeetCode 155](https://leetcode.com/problems/min-stack/)