package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList<>();
        if(matrix.length == 0) return ans;
        int c1 = 0, c2 = matrix[0].length - 1;
        int r1 = 0, r2 = matrix.length - 1;
        while(c1 <= c2 && r1 <= r2){
            for(int i = c1; i <= c2; i++) ans.add(matrix[r1][i]);
            for(int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }

        return ans;
    }
}
