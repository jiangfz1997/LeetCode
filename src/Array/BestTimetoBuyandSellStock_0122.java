package Array;

public class BestTimetoBuyandSellStock_0122 {

    /*要记住：此类连续波动问题，峰值d - 峰值a < (峰值c-峰值a) + (峰值d - 峰值c)*/

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i =  1; i < prices.length; i++){
            if(prices[i] > prices[i-1]) maxProfit += prices[i] - prices[i-1];
        }
        return maxProfit;
    }
}
