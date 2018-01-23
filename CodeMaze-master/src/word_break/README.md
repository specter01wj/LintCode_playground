# Word Break

> Given a __non-empty__ string _s_ and a dictionary _wordDict_ containing a list of __non-empty__ words, determine if _s_ can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

## Example

s = `"leetcode"`,

dict = `["leet", "code"]`.

Return true because `"leetcode"` can be segmented as `"leet code"`.

## Solution

- Standard DP. [Java](solution1.java) | [C++](solution1.cpp)
- Use Trie Tree Search to assist DP. (To do)

## Source

[LeetCode 139](https://leetcode.com/problems/word-break/)

[LintCode 107](http://www.lintcode.com/en/problem/word-break/)