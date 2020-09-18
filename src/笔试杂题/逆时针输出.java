package 笔试杂题;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class 逆时针输出 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] matrix = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = in.nextInt();
                }
            }
            LinkedHashMap hm = new LinkedHashMap<>();

            int left = 0, right = n-1, up = 0, down = m-1;
            while(up <= down || left <= right){
                for(int i = up; i <= down; i++){
                    System.out.print(matrix[i][left]);
                }
                left++;
                for(int i = left; i < right; i++){
                    System.out.print(matrix[down][i]);
                }
                down--;
                for(int i = down; i >= up; i--){
                    System.out.print(matrix[i][right]);
                }
                right--;
                for(int i = right; i >= left; i--){
                    System.out.print(matrix[up][i]);
                }
                up++;
            }
        }


    }
}
