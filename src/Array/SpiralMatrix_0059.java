package Array;

public class SpiralMatrix_0059 {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        if(n <= 0) return m;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int k = 1;
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                m[top][i] = k++;
            }

            for(int j = top+1; j <= bottom; j++){
                m[j][right] = k++;
            }

            for(int c = right-1; c>left; c--){//bottom
                m[bottom][c]= k++;
            }
            for(int r = bottom; r>top; r--){//left
                m[r][left] = k++;
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return m;
    }
}
