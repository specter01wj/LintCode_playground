M
1516602798

给出步数，看能不能reach to end.

Status:
DP[i]: 在i点记录，i点之前的步数是否可以走到i点？ True of false.
    其实j in [0~i)中间只需要一个能到达i 就好了
Function:
DP[i] = DP[j] && (j + A[j]), for all j in [0 ~ i)
Return:
    DP[dp.length - 1];

```
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

This can be done using DP. However, greedy algorithm is fast in this particular problem. Consider both solutions.

DP

*/

/*
Thoughts:
Can/Cannot -> DP.
f[x] = if able to reach f[x], store true/false
if (f[x-1] >= 1), then able to reach f[x]
becomes: if able to jump to f[x-1].
equation:
f[x] = f[x-1] && A[x-1] >= x - 1
f[0] = true
*/
class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        final boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && (nums[j] + j >= i)) {
                    dp[i] = true;    
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }
}

/*
Same solution as above.
Thinking Process:
We have array A, that stores the # of steps for each index.
State: f[i] means if previous steps can reach to i. True/False
Function: f[i] = f[j] && (j + A[j] >= i)
Init: f[0] = true
Answer: f[n-1], if n is the length of A
 */

/*

Greedy. Ideas from Yu’s Garden
At each index, check how far we can jump, store this forest-can-jump position in variable ‘farest’. 
Take max of current farest and (index + A[index]), store is in farest

At each index, compare if ‘farest’ is greater than the end of array, if so, found solution, return true.

At each index, also check if ‘farest == current index’, 
that means the farest we can move is to current index and we cannot move forward. 
Then return false.
*/

/*
Thoughts:
Greedy.
Find a farest position at current position. 
If farest <= i, that means it can't jump forward, false.
*/
class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        long farest = 0;
        for (int i = 0; i < nums.length; i++) {
            farest = Math.max(farest, i + nums[i]);
            if (farest >= nums.length - 1) {
                return true;
            }
            if (farest == i) {
                return false;
            }
        }
        return true;
    }
}


```