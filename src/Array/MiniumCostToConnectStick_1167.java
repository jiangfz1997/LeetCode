package Array;

import java.util.PriorityQueue;

public class MiniumCostToConnectStick_1167 {
    public int connectSticks(int[] sticks) {
        if(sticks.length == 0) return 0;
        int result = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i : sticks){
            heap.add(i);
        }

        while(!heap.isEmpty()){
            int a = heap.poll();
            if(heap.isEmpty()) return result;
            int b = heap.poll();
            result += a + b;
            heap.add(a + b);
        }
        return 0;
    }
}
