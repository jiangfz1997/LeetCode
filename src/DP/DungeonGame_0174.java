package DP;

public class DungeonGame_0174 {
    class Solution {
        /*public int calculateMinimumHP(int[][] dungeon) {
            int row = dungeon.length;
            if(row == 0) return 0;
            int column = dungeon[0].length;
            int[][] dp = new int[row][column];

            for(int i = row - 1; i >= 0; i--){
                for(int j = column - 1; j >= 0; j--){
                    if(i == row-1 && j == column-1) dp[i][j] = Math.max(1, 1 - dungeon[i][j]);
                    else if(i == row-1) dp[i][j] = Math.max(1, dp[i][j+1] - dungeon[i][j]);
                    else if(j == column-1) dp[i][j] = Math.max(1, dp[i+1][j] - dungeon[i][j]);
                    else dp[i][j] = Math.min(Math.max(1, dp[i+1][j] - dungeon[i][j]), Math.max(1, dp[i][j+1] - dungeon[i][j]));
                }
            }
            return dp[0][0];
        }*/
        public int calculateMinimumHP(int[][] dungeon) {
            int n = dungeon.length;
            int m = dungeon[0].length;
            int[] dp = new int[m];

            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i + 1 == n && j + 1 == m) {
                        dp[j] = Math.max(1 - dungeon[i][j], 1);
                        continue;
                    }

                    if (i + 1 == n) {
                        dp[j] = Math.max(dp[j + 1] - dungeon[i][j], 1);
                    } else if (j + 1 == m) {
                        dp[j] = Math.max(dp[j] - dungeon[i][j], 1);
                    } else {
                        int right = Math.max(dp[j + 1] - dungeon[i][j], 1);
                        int down = Math.max(dp[j] - dungeon[i][j], 1);
                        dp[j] = Math.min(right, down);
                    }
                }
            }

            return dp[0];
        }
    }
}
