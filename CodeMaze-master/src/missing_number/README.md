# Missing Number

> Given an array containing n distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing from the array.

## Example

```
Input: [3,0,1]
Output: 2
```

```
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
```

## Follow up

Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

## Solution

- Two loop. [Java](solution1.java)
- One loop, `XOR`. [Java](solution2.java)

## Source

[LeetCode 268](https://leetcode.com/problems/missing-number/)