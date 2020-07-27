package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NextPermutation_0031 {
    public static void nextPermutation(int[] nums) {
        int l = nums.length;
        int pivot = l-2;
        while(pivot >= 0){
            if(nums[pivot] < nums[pivot+1]){
                break;
            }
        }
        if(pivot != 0){
            for(int tmp = pivot+1; tmp < l; tmp++){
                if(nums[tmp] < nums[pivot]){
                    swap(nums, pivot, tmp-1);
                }
            }
        }
        reverse(nums, pivot+1);
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,5,1};
        nextPermutation(a);
    }
}
