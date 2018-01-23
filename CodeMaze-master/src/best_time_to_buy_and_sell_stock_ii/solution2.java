class Solution {
    public int maxProfit(int[] prices) {
        int sz = prices.length;
        if (sz <= 1) {
            return 0;
        }
        int profit = 0;
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        
        while (i < sz - 1) {
            while (i + 1 < sz && prices[i] >= prices[i + 1]) {
                ++i;
            }
            valley = prices[i];
            while (i + 1 < sz && prices[i] <= prices[i + 1]) {
                ++i;
            }
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }
}