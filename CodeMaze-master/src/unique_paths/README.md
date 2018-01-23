# Unique Paths

> A robot is located at the top-left corner of a _m_ x _n_ grid (marked 'Start' in the diagram below).
>
> The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
>
> How many possible unique paths are there?

## Example

![Robot Maze](robot_maze.png)

| 1,1 | 1,2 | 1,3 | 1,4 | 1,5 | 1,6 | 1,7 |
|----:|-----|-----|-----|-----|-----|-----|
| 2,1 |     |     |     |     |     |     |
| 3,1 |     |     |     |     |     | 3,7 |

## Notice

m and n will be at most 100.

## Solution

- Dynamic Programming. [Java](solution1.java) | [C++](solution1.cpp)
	- `dp[i][j] = dp[i - 1][j] + dp[i][j - 1]`

## Source

[LeetCode 62](https://leetcode.com/problems/unique-paths/)

[LintCode 114](http://www.lintcode.com/en/problem/unique-paths/)