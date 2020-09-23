package Array;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros_0073 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == 0){
                    if(!row.contains(i))
                        row.add(i);
                    if(!column.contains(j))
                        column.add(j);
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){

                if(row.contains(i) || column.contains(j))
                    matrix[i][j] = 0;

            }
        }
        return;
    }
}
