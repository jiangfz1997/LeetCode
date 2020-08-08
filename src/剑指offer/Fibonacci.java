package 剑指offer;

public class Fibonacci {
    public int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < n; i++){
            dp[i] = -1;
        }
        return helper(n, dp);
    }
    public int helper(int n, int[] dp){
        if(dp[n] != -1) return dp[n];
        return helper(n-1, dp)+ helper(n-2,dp);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.Fibonacci(10);
    }
}
