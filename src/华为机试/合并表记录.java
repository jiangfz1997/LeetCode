package 华为机试;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 合并表记录 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] cache = new int[n][2];
        for(int i = 0; i < n; i++){
            cache[i][0]  = in.nextInt();
            cache[i][1]  = in.nextInt();
        }
        Arrays.sort(cache, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < n; ){
            int sum = 0;
            int tmp = cache[i][0];
            while(i < n && tmp == cache[i][0]){
                sum += cache[i][1];
                i++;
            }
            System.out.println(tmp + " " + sum);
        }
    }
}
