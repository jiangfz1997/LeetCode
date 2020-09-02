package 华为机试;

import java.util.Scanner;

public class 背包问题 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int item = in.nextInt();
            int space = in.nextInt();
            int[] weight = new int[item+1];
            int[] value = new int[item+1];
            for(int i = 1; i < item+1; i++){
                weight[i] = in.nextInt();
            }
            for(int i = 1; i < item+1; i++){
                value[i] = in.nextInt();
            }
            int[][] dp = new int[item+1][space+1];
            for(int i = 1; i < item+1; i++){
                for(int j = 1; j < space+1; j++){
                    if(j-weight[i] >= 0)
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight[i]]+value[i]);
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
            System.out.println(dp[item][space]);
        }
    }
}
