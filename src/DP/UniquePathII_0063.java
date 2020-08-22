package DP;

public class UniquePathII_0063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] dp = new int[row][column];
        boolean flag = true;
        for(int i = 0; i < column; i++){
            if(!flag) dp[0][i] = 0;
            else{
                if(obstacleGrid[0][i] == 1){
                    dp[0][i] = 0;
                    flag = false;
                }else{
                    dp[0][i] = 1;
                }
            }
        }
        flag = true;
        for(int i = 0; i < row; i++){
            if(!flag) dp[i][0] = 0;
            else{
                if(obstacleGrid[i][0] == 1){
                    dp[i][0] = 0;
                    flag = false;
                }else{
                    dp[i][0] = 1;
                }
            }
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < column; j++){
                if(obstacleGrid[i][j] == 0)
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else
                    dp[i][j] = 0;
            }
        }
        return dp[row-1][column-1];
    }
}
