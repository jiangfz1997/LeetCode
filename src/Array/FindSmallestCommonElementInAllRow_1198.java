package Array;

import java.util.*;

public class FindSmallestCommonElementInAllRow_1198 {
    /*public int smallestCommonElement(int[][] mat) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(mat,new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if(x[0] < y[0]){
                    return -1;
                } else if(x[0] > y[0]){
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        int max = mat[0][mat[0].length-1];
        int min = mat[mat.length-1][0];
        if(min > max)
            return -1;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] > max)
                    break;
                if(mat[i][j] >= min && mat[i][j] <= max)
                    map.put(mat[i][j],map.getOrDefault(mat[i][j], 0)+1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrys = map.entrySet();
        for(Map.Entry<Integer, Integer> e : entrys){
            if(e.getValue() == mat.length)
                return e.getKey();
        }
        return -1;
    }*/
    public int smallestCommonElement(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int pos[] = new int[n];
        for (int j = 0; j < m; ++j) {
            boolean found = true;
            for (int i = 1; i < n && found; ++i) {
                pos[i] = Arrays.binarySearch(mat[i], pos[i], m, mat[0][j]);
                if (pos[i] < 0) {
                    found = false;
                    pos[i] = -pos[i] - 1;
                    if (pos[i] >= m) {
                        return -1;
                    }
                }
            }
            if (found) {
                return mat[0][j];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,9,10};
        System.out.println(Arrays.binarySearch(a, 0, a.length, 8));
    }
}
