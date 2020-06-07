package DP;

// 找最小和最大两个值的差

public class BestTimeToBuyAndSellStock_0122 {
    public int maxProfit(int[] prices) {
        int minNumber = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minNumber) minNumber = prices[i];
            if(prices[i] - minNumber > maxProfit) maxProfit = prices[i] - minNumber;
        }
        return maxProfit;
    }
}
