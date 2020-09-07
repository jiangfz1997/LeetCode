package DP;

public class CountSquareSubmatriceswithAllOnes_1277 {
    public static int countSquares(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i > 0 && j > 0 && matrix[i][j] == 1){
                    matrix[i][j] += Math.min(matrix[i-1][j] , Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                }

                count += matrix[i][j];
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[][] test = {{0,0,0}, {0,1,0}, {0,1,0}, {1,1,1}, {1,1,0}};
        System.out.println(countSquares(test));
    }
}
