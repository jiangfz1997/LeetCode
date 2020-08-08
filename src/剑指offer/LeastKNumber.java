package 剑指offer;

import java.util.*;

public class LeastKNumber {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> array = new ArrayList<>();
        if(k == 0) return array;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, new Comparator<Integer>(){

            public int compare(Integer o1, Integer o2){
                return o2-o1;
            }
        });
        for(int i = 0; i < input.length; i++){
            if(minHeap.size() < k) minHeap.add(input[i]);
            else{
                if(minHeap.peek() > input[i]){
                    minHeap.poll();
                    minHeap.add(input[i]);
                }
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = minHeap.poll();
        }
        for(int i = k-1; i >=0; i--){
            array.add(ans[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        GetLeastNumbers_Solution(a,4);
    }
}
