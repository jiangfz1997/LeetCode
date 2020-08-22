package 方法分类.堆的应用;
import java.util.*;
public class TopKFrequentWord_0692 {
    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> map = new HashMap<>();
            for(String s : words){
                map.put(s, map.getOrDefault(s, 0)+1);
            }
            PriorityQueue<String> heap =  new PriorityQueue<String>(
                    (w1,w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));

            List<String> list = new ArrayList<>();

            for(String s : map.keySet()){
                heap.offer(s);
                if(heap.size() > k) heap.poll();
            }

            while(!heap.isEmpty()){
                list.add(heap.poll());
            }
            Collections.reverse(list);
            return list;
        }
    }
}
