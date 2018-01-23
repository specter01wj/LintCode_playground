# Kill Process

> Given __n__ processes, each process has a unique __PID (process id)__ and its __PPID (parent process id)__.
>
> Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.
>
> We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.
>
> Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.

## Example

```
Input: 
pid =  [1, 3, 10, 5]
ppid = [3, 0, 5, 3]
kill = 5
Output: [5,10]
Explanation: 
           3
         /   \
        1     5
             /
            10
Kill 5 will also kill 10.
```

## Notice

- The given kill id is guaranteed to be one of the given PIDs.
- `n >= 1`.

## Solution

- _Union find_ `root` way, [Java](solution1_0.java). Will casue Time Limit Exceeded
- Map and queue bfs. [Java](solution2.java). Very fast.

## Source

[LeetCode 582](https://leetcode.com/problems/kill-process/)