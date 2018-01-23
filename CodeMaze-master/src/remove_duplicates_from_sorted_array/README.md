# Remove Duplicates from Sorted Array

> Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
> 
> Do not allocate extra space for another array, you must do this in place with constant memory.
> 
> For example,
> 
> Given input array A = `[1,1,2]`,
> 
> Your function should return length = `2`, and A is now `[1,2]`.

## Solution 1

Time complexity _O(n)_, space complexity _O(1)_.

Two pointers to traverse the array.

## Solution 2

Use [std::distance](http://www.cplusplus.com/reference/iterator/distance/?kw=distance), [std::unique](http://www.cplusplus.com/reference/algorithm/unique/?kw=unique). 

Time complexity _O(n)_, space complexity _O(1)_.

## Sources