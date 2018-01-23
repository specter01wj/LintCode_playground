class Solution {
    public int maxProfit(int[] prices) {
        int max;
        int l = prices.length;
        if (l == 0 || l == 1) {
            return 0;
        }
        int[] d = new int[l];
        d[l-2] = prices[l-1] - prices[l-2];
        max = d[l-2];
        for (int i = l - 3; i >= 0; --i) {
            d[i] = ((prices[i+1] > d[i+1] + prices[i+1]) ? prices[i+1] : d[i+1] + prices[i+1]) - prices[i];
            if (max < d[i]) {
                max = d[i];
            }
        }
        if (max < 0) return 0;
        return max;
    }
}