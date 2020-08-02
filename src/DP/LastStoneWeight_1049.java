package DP;

import java.util.Scanner;

public class LastStoneWeight_1049 {
    /*public int lastStoneWeightII(int[] stones) {
        int length = stones.length;
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += stones[i];
        }
        int[][] dp = new int[length+1][sum/2+1];
        for(int i = 1; i < length+1; i++){
            for(int j = 1; j < sum/2+1; j++){
                dp[i][j] = j >= stones[i-1] ? Math.max(dp[i-1][j], dp[i-1][j-stones[i-1]] + stones[i-1]) : dp[i-1][j];
            }
        }
        return sum - 2 * dp[length][sum/2];
    }*/
/*public int lastStoneWeightII(int[] stones) {
    *//* 由于石头拿走还能放回去，因此可以简单地把所有石头看作两堆
     * 假设总重量为 sum, 则问题转化为背包问题：如何使两堆石头总重量接近 sum / 2
     *//*
    int len = stones.length;
    *//* 获取石头总重量 *//*
    int sum = 0;
    for (int i : stones) {
        sum += i;
    }
    *//* 定义 dp[i] 重量上限为 i 时背包所能装载的最大石头重量 *//*
    int maxCapacity = sum/2;
    int[] dp = new int[maxCapacity + 1];
    for (int i = 0; i < len; i++) {
        int curStone = stones[i];
        for (int j = maxCapacity; j >= curStone; j--) {
            dp[j] = Math.max(dp[j], dp[j-curStone] + curStone);
        }
    }
    return sum - 2 * dp[maxCapacity];
}*/
public int lastStoneWeightII(int[] stones) {
    int length = stones.length;
    int sum = 0;
    for(int i = 0; i < length; i++){
        sum += stones[i];
    }
    int[] dp = new int[sum/2+1];
    for(int i = 1; i < length+1; i++){
        for(int j = sum/2; j >= 0; j--){
            dp[j] = j >= stones[i-1] ? Math.max(dp[j], dp[j-stones[i-1]] + stones[i-1]) : dp[j];
        }
    }
    return sum - 2 * dp[sum/2];
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String strings = s.nextLine();
        String[] split = strings.split(",");
        int[] a = new int[split.length];
        for(int i = 0; i < a.length; i++) a[i] = Integer.parseInt(split[i]);
        LastStoneWeight_1049 l = new LastStoneWeight_1049();
        System.out.println(l.lastStoneWeightII(a));

    }
}
