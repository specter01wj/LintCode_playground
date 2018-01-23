# Longest Substring Without Repeating Characters

> Given a string, find the length of the __longest substring__ without repeating characters.

## Example

Given `"abcabcbb"`, the answer is `"abc"`, which the length is 3.

Given `"bbbbb"`, the answer is `"b"`, with the length of 1.

Given `"pwwkew"`, the answer is `"wke"`, with the length of 3. Note that the answer must be a substring, `"pwke"` is a subsequence and not a substring.


## Solution

- Slide window, Use three indexes: `start`, `end`, `probe`. [Java](solution1.java)
    1. Forward `probe` 1 step
    2. If `probe` exists in `start` to `end` range, set `start` to the index after the repeating index.
    3. Forward `end` to `probe`

## Source

[LeetCode 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/)