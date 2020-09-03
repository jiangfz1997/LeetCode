package DP;

public class DivisorGame {
    public boolean divisorGame(int N) {
        if(N == 1) return false;
        boolean[] dp = new boolean[N+1];
        dp[1] = false;
        dp[2] = true;
        boolean flag = false;
        for(int i = 3; i < dp.length; i++){
            for(int j = 1; j <= i/2; j++){
                if(i % j == 0 && !dp[i-j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];

    }
}
