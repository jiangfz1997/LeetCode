package Array;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval_0057 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right= newInterval[1];
        //int[] pre = intervals[0];
        List<int[]> list = new ArrayList<>();
        if(intervals.length == 0){
            int[][] tmp = new int[1][2];
            tmp[0] = newInterval;
            return tmp;

        }
        boolean flag = false;
        for(int i = 0; i < intervals.length; i++){
            int[] curr = intervals[i];
            if(curr[1] < left){
                list.add(curr);
                continue;
            }else if(!flag && curr[0] > right){
                int[] tmp = {left, right};
                list.add(tmp);
                left = -1;
                list.add(curr);
                flag = true;
                continue;
            }else if(curr[0] > right){
                list.add(curr);
                continue;
            }else{
                left = Math.min(left, curr[0]);
                right = Math.max(right, curr[1]);
            }
        }
        if(left != -1){
            int[] tmp = {left, right};
            list.add(tmp);
        }
        int[][] result = new int[list.size()][2];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }


        return result;

    }

    public static void main(String[] args) {
        int[][] a = {{1,5}} ;
        int[] b = {2,3};
        insert(a, b);
    }
}
