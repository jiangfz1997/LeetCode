package DP;

public class StoneGame_0877 {
    int[][] dp;
    public boolean stoneGame(int[] piles) {
        dp = new int[piles.length][piles.length];
        return helper(0, piles.length-1, 0, 0, 1, piles);
    }

    public boolean helper(int left, int right, int a, int b, int turns, int[] piles){
        if(dp[left][right] != 0)
            return dp[left][right] == 1;
        boolean flag;
        if(left == right){
            if(turns == 1){
                flag = a+piles[left] > b ? true : false;
                dp[left][right] = flag ? 1 : 2;
                return flag;
            }else{
                flag = b+piles[left] < a ? true : false;
                dp[left][right] = flag ? 1 : 2;
                return flag;
            }
        }else{
            if(turns == 1){
                flag = helper(left+1, right, a+piles[left], b, 2, piles) || helper(left, right-1, a + piles[right], b, 2, piles);
            }else{
                flag = helper(left+1, right, a, b+piles[left], 1, piles) || helper(left, right-1, a, b + piles[right], 1, piles);
            }
            dp[left][right] = flag == true ? 1 : 2;
        }
        return flag;
    }
}
