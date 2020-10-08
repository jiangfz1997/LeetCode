package Array;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
    class Solution {
        public List<Integer> pancakeSort(int[] arr) {
            int end = arr.length-1;
            List<Integer> list = new ArrayList<>();
            while(end > 0){
                int p = this.findK(arr, end);
                if(p == end){
                    end--;
                    continue;
                }
                list.add(p+1);
                this.reverse(arr, p);
                list.add(end+1);
                this.reverse(arr, end);
                end--;
            }
            return list;
        }
        public int findK(int[] arr, int right){
            int position = 0;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i <= right; i++){
                if(max < arr[i]){
                    position = i;
                    max = arr[i];
                }
            }
            return position;
        }
        public int[] reverse(int[] arr, int k){
            int left = 0, right = k;
            while(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
            return arr;
        }
    }
}
