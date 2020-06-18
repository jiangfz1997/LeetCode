package DP;

public class UniquePath_0062 {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[n][m];
        matrix[0][0] = 1;
        for(int i = 1; i < m; i++) matrix[0][i] = 1;
        for(int i = 1; i < n; i++) matrix[i][0] = 1;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                matrix[j][i] = matrix[j-1][i] + matrix[j][i-1];
            }
        }
        return matrix[n-1][m-1];
    }
}
