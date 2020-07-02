package Array;

import java.util.Arrays;

public class HeightChecker_1051 {
    public int heightChecker(int[] heights) {
        int[] tmp = new int[heights.length];
        //tmp = heights;
        for(int i = 0; i < tmp.length; i++ ){
            tmp[i] = heights[i];
        }
        Arrays.sort(tmp);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(tmp[i] != heights[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        HeightChecker_1051 h = new HeightChecker_1051();
        int[] a = {1,1,3,2,5,4};
        h.heightChecker(a);
    }
}
