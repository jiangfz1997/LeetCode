package Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthCloestPointToOrigin_0973 {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(points.length, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return -(b[0]*b[0]+b[1]*b[1] - (a[0]*a[0] + a[1]*a[1]));
            }
        });

        for(int i = 0; i < points.length; i++){
            heap.add(points[i]);
        }
        int[][] result = new int[K][2];

        for(int i = 0; i < K; i++){
            result[i] = heap.poll();
        }
        return result;

    }
}
