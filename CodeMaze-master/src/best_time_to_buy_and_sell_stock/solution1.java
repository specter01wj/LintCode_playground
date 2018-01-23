class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for (int i = 0; i < prices.length; ++i) {
            lowest = prices[i] < lowest ? prices[i] : lowest;
            max_profit = max_profit > prices[i] - lowest ? max_profit : prices[i] - lowest;
        }
        
        return max_profit;
    }
}