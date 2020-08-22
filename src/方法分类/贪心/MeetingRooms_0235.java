package 方法分类.贪心;
import java.util.*;
public class MeetingRooms_0235 {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a - b;
            }
        });

        queue.add(intervals[0][1]);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= queue.peek()) queue.poll();
            queue.add(intervals[i][1]);
        }
        return queue.size();
    }
}
