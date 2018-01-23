# First Unique Character in a String

> Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

## Example

```
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
```

## Solution

- Two loops, first create __HashMap__, second get first unique char. [Java](solution1.java)
- Without HashMap, [Java](solution2.java)

## Source

[LeetCode 387](https://leetcode.com/problems/first-unique-character-in-a-string/)