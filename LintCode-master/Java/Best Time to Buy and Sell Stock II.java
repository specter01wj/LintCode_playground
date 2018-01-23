E

和Stock I 的区别：可以买卖多次，求总和的最大盈利。

找涨幅最大的区间，买卖：
找到低谷，买进:peek = start + 1 时候，就是每次往前走一步;若没有上涨趋势，继续往低谷前进。
涨到峰顶，卖出:一旦有上涨趋势，进一个while loop，涨到底, 再加个profit.

profit += prices[peek - 1] - prices[start]; 挺特别的。
当没有上涨趋势时候，peek-1也就是start, 所以这里刚好profit += 0.

O(n)

这道题有几种其他不同的思路:
1. 如上, 从低谷找peek, sell.
2. Greedy, 每次有相邻的diff符合profit条件, 就卖了, 最后把所有的diff加在一起. 计算delta, 其实简单粗暴, 也还不错.
3. DFS计算所有(timeout).Improvement on DFS -> DP -> calculate sellOn[i] and buyOn[i], and then return buyOn[i]. 有点难想, 但是代码简单, 也是O(n)

```
/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions 
at the same time (ie, you must sell the stock before you buy again).

Example
Given an example [2,1,2,0,1], return 2

Tags Expand 
Greedy Enumeration Array
*/
/*
Thought:
In this case, since we know the entire stock price for all days in the array, we want to this:
Sell it at nearest peek price and buy it on the next dropped price, then sell again at next peek.
Two pointers, start and peek, to track the starting point and the peek.
Two while loop:
While loop on start, until start reaches the last 2nd index, we only have 1 option to sell.
Inner while loop that finds the peek from start.
Note: peek always has index >= start+1.
Sum up all profit and return it.
Tricky thing: we are looking for max profit, but does not require to sell the stock by end of array. 
So if the price is dropping, we are not selling and we are not losing/winning anything.

*/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int curr = 0;
        int profit = 0;
        int peek = 1;
        while(curr < prices.length) {
            while (peek < prices.length && prices[peek - 1] <= prices[peek]) {
                peek++;
            }
            profit += prices[peek - 1] - prices[curr];
            curr = peek;
            peek = curr + 1;
        }
        return profit;
    }
}

/*
Thoughts:
Greedy: when seeing a increase, sell, accumulate the delta benefits.
For instance, at a inclining slope, the sum of delta changes between (i-1, i) equals to the increase of (0 , n), so it's okay to do greedy.
But this is less inteligent, and not very applicable
*/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}

/*
Thoughts:
Optimize the DFS (since it times out)
buyOn[i]: [i ~ n], if buying on day i, what's the best profit
sellOn[i]: [i ~ n], if selling on day i, what's the best profit.
equation:
buyOn[i]: on day i, we can buy && sell on day [i + 1], or do nothing.
sellOn[i]: on day i, we can sell && buy on day [i + 1], or do nothing.

buyOn[0]: max value will be calculated and saved up here.

O(n)

However, still very slow, only beat 2%
*/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int[] buyOn = new int[prices.length];
        int[] sellOn = new int[prices.length];
        int length = prices.length;
        buyOn[length - 1] = 0;
        sellOn[length - 1] = prices[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            buyOn[i] = Math.max(buyOn[i + 1], sellOn[i + 1] - prices[i]); // (not buying on day i; buying on day i, so - prices[i])
            sellOn[i] = Math.max(sellOn[i + 1], buyOn[i + 1] + prices[i]);// (not selling on day i; selling on day i, so + prices[i])
        }
        return Math.max(0, buyOn[0]);
    }
}




/*
Thoughts:
On given day: we can choose to buy or sell or move with no action, which generates different paths -> DFS
However: 196 / 198 test cases passed but times out.
*/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        return Math.max(dfs(prices, 1, true) - prices[0], dfs(prices, 1, false));
    }
    private int dfs(int[] prices, int index, boolean sellStatus) {
        if (index == prices.length - 1) {
            return sellStatus ? prices[index] : 0;
        }
        int profit = 0;
        for (int i = index; i < prices.length; i++) {
            //No action
            profit = Math.max(profit, dfs(prices, i + 1, sellStatus));
            //Sell or buy:
            int levelDelta = sellStatus ? prices[i] : - prices[i];
            profit = Math.max(profit, dfs(prices, i + 1, !sellStatus) + levelDelta);
        }
        return profit;
    }
}
```