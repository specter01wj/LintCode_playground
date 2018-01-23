# Reverse Integer

> Given a 32-bit signed integer, reverse digits of an integer.

## Example

1
```
Input: 123
Output:  321
```

2
```
Input: -123
Output: -321
```

3
```
Input: 120
Output: 21
```

## Notice

Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## Solution

- Use Queue. [Java](solution1.java)
- In one loop. [Java](solution2.java)

## Notes

- `Integer.MIN_VALUE` will overflow if use `Math.abs(x)`
- If overflow happens, `oldResult != (result - tmp) / 10`

## Source

[LeetCode 7](https://leetcode.com/problems/reverse-integer/)