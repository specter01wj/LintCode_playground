# Count Binary Substrings

> Give a string `s`, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
>
> Substrings that occur multiple times are counted the number of times they occur.

## Example

1

```
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

Notice that some of these substrings repeat and are counted the number of times they occur.

Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
```

2

```
Input: "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
```

## Note

- `s.length` will be between 1 and 50,000.
- `s` will only consist of "0" or "1" characters

## Solution

1. prevSeq count the same item happend before (let say you have 0011, prevSeq = 2 when you hit the first 1, means there are two zeros before first '1')
2. currSeq count the current number of items (let say you have 0011, currSeq = 2 when you hit the second 1, means there are two 1s so far)
3. Whenever item change (from 0 to 1 or from 1 to 0), prevSeq change to currSeq, reset currSeq to 1 (store the currSeq number into PrevSeq, reset currSeq)
4. Every time prevSeq >= currSeq means there are more 0s before 1s, so could do count++ . (This was the tricky one, ex. 0011 when you hit the first '1', currSeq = 1, prevSeq = 2, means 0s number is larger than 1s number, so we could form "01" at this time, count++ . When you hit the second '1', currSeq = 2, prevSeq = 2, means 0s' number equals to 1s' number, so we could form "0011" at this time, that is why count++)

[Java](solution1.java)

## Source

[LeetCode 696](https://leetcode.com/problems/count-binary-substrings/)