# Trapping Rain Water

> Given _n_ non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

## Example

Given `[0,1,0,2,1,0,1,3,2,1,2,1]`, return `6`.

![rainwatertrap example image](rainwatertrap.png)

The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

## Solution

- For each element in the array, we find the maximum level of water it can trap after the rain, which is equal to the minimum of maximum height of bars on both the sides minus its own height. [Java](solution1.java)
- Dynamic programming. [Java](solution2.java)
	- Find maximum height of bar from the left end upto an index `i` in the array `left_max`.
	- Find maximum height of bar from the right end upto an index `i` in the array `right_max`.
	- Iterate over the `height` array and update ans
		- Add `min(max_left[i],max_right[i])−height[i]` to `ans`.
- Two pointers. [Java](solution3.java)
	- Initialize `lef` pointer to 0 and `right` pointer to `size-1`
	- While `left< right`, do:
		- If `height[left]` is smaller `height[right]`
			- If `height[left]>=left_max`, update `left_max`
			- Else add `left_max−height[left]` to `ans`
			- Add 1 to `left`.
		- Else
			- If `height[right]>=right_max`, update `right_max`
			- Else add `right_max−height[right]` to `ans`
			- Subtract 1 from `right`.

## Source

[LeetCode 42](https://leetcode.com/problems/trapping-rain-water/)