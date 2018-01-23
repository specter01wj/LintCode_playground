class Solution {
    public int maxProfit(int[] prices) {
        int sz = prices.length;
        if (sz <= 1) {
            return 0;
        }
        int profit = 0;
        for (int i = 0; i < sz - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}