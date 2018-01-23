# Implement strStr()

> Implement strStr() in O(n + m) time.
>
> Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

## Example

If source = "source" and target = "target", return -1.

If source = "abcdabcdefg" and target = "bcd", return 1.

## Solution

Use _Rabin Karp_, time is `O(n+m)`, which is actually to create hash function to compare string.

[Java](solution1.java)


## Source

[LintCode 594](http://www.lintcode.com/en/problem/strstr-ii/)