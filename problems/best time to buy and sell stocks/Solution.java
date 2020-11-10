public class Solution {
    public int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice)
                buyPrice = prices[i];
            else
                profit = Math.max(profit,prices[i] - buyPrice);
        }
        return profit;
    }
}
