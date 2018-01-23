class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sold = 0; //the maxProfit you have if you don't have a stock that day
        int own = -prices[0]; //the maxProfit you have if you have a stock that day, if you have a stock the first day,hold=-prices[0]
        
        int sz = prices.length;
        for (int i = 1; i < sz; ++i) {
            sold = Math.max(sold, own + prices[i] - fee); // sold in day i is the maxProfit of sold in day i-1 or you sell your stock  
            own = Math.max(own, sold - prices[i]);
        }
        
        return sold;
    }
}