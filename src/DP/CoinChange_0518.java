package DP;

public class CoinChange_0518 {

    public int change(int amount, int[] coins) {

        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin : coins){
            for(int i = coin; i < amount+1; i++){
                dp[i] = dp[i - coin] + dp[i];
            }

        }

        return dp[amount];

    }
}
