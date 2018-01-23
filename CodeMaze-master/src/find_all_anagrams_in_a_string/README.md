# Find All Anagrams in a String

> Given a string `s` and a non-empty string `p`, find all the start indices of `p`'s anagrams in `s`.
>
> Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

## Example

__Example 1:__

```
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
```

__Example 2:__

```
Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
```

## Solution

#### Use _Window Sliding_ algorithm

[Java V1](solution1_1.java), [Java V2](solution1_2.java)

#### Use array to save char count, then compare with part of `s`

[Java](solution2.java)

Following solution(use Map) will cause Time Limit Exceeded:

[Java](solution2_0.java)

## Source

[LeetCode 438](https://leetcode.com/problems/find-all-anagrams-in-a-string/)