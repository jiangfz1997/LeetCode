package Array;

import java.util.*;

public class ReduceArraySizeToHalf_1338 {
    public static int minSetSize(int[] arr) {
        /*Map<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });*/
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int k = arr[i];
            map.put(k, map.getOrDefault(k, 0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        int l = arr.length;
        int count = 0;
        for(Map.Entry<Integer, Integer> e : list){
            l -= e.getValue();
            count++;
            if(l <= arr.length/2)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {2,2,2,2,3,3,4};
        minSetSize(a);
    }
}
