package DP;

import java.util.List;

public class Triangle_0120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;
        int size = triangle.size();
        int[] result = new int[size+1];
        for(int i = triangle.size()-1; i >=0; i-- ){
            List<Integer> tmp = triangle.get(i);
            for(int j = 0; j < tmp.size(); j++){

                result[j] = Math.min(result[j], result[j+1])+tmp.get(j);
            }
        }
        return result[0];
    }
}
