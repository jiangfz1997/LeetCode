package Array;

import java.util.*;

public class TheKStrongestValues_1471 {
    public static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int median = arr[arr.length/2-1];

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o2-median) - Math.abs(o1-median);
            }
        }.thenComparing(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }));
        int[] result = new int[k];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;


    }

    public static void main(String[] args) {
        int[] arr = {-7, 22, 17, 3};
        getStrongest(arr, 2);
    }
}
