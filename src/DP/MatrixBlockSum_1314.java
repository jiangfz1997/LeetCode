package DP;

public class MatrixBlockSum_1314 {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] dp = new int[mat.length+1][mat[0].length+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){

                dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + mat[i-1][j-1];
            }
        }

        for(int i = 0; i < mat.length; i++){
            int up = i-K > 0 ? i-K : 0;
            int down = i+K >= mat.length ? mat.length-1 : i+K;
            for(int j = 0; j < mat[0].length; j++){
                int left = j - K > 0 ? j-K : 0;
                int right = j+K < mat[0].length ? j+K : mat[0].length-1;
                mat[i][j] = dp[down+1][right+1] - dp[down+1][left] - dp[up][right+1] + dp[up][left];
            }
        }
        return mat;
    }
}
