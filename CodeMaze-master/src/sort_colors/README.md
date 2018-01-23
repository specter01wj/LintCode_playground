# Sort Colors

> Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
>
> Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
>
> __Notice__
>
> You are not suppose to use the library's sort function for this problem.
>
> The solution set must not contain duplicate subsets.
>
> __Follow up__
>
> A rather straight forward solution is a two-pass algorithm using counting sort.
>
> First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
> Could you come up with an one-pass algorithm using only constant space?

## Example

Given `[1, 0, 1, 2]`, sort it in-place to `[0, 1, 1, 2]`.

## Solution

[Java](solution1.java)

## Source

[LeetCode 75](https://leetcode.com/problems/sort-colors/)

[LintCode 148](https://www.lintcode.com/en/problem/sort-colors/)